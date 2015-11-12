package com.awesome.yolo_ferry_contract;

import com.awesome.DTO.DiscountDTO;
import com.awesome.DTO.HarborDTO;
import com.awesome.DTO.RouteDTO;
import com.awesome.DTO.TimeTableDTO;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import junit.framework.TestSuite;
import static org.jmock.AbstractExpectations.returnValue;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.jmock.internal.ExpectationBuilder;
import org.junit.Rule;

/**
 * Unit test for simple App.
 */
public class CustomerContractTest extends TestCase
{
    @Rule
    private JUnitRuleMockery context;
    
    @Mock CustomerContract customerContract;
    @Mock AdminContract adminContract;
    
    //@Mock CustomerContract customerContract;
    //@Mock AdminContract adminContract;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        context = new JUnitRuleMockery();
        customerContract = context.mock(CustomerContract.class);
        adminContract = context.mock(AdminContract.class);
    }
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CustomerContractTest(String testName){
        super(testName);
    }
    
    public void testGetAllHarbors(){
        context.checking(new Expectations(){{
            oneOf(adminContract).createHarbor("Helsingor");
            will(returnValue(true));
            oneOf(adminContract).createHarbor("Copenhagen");
            will(returnValue(true));
        }});
        
        assertTrue(adminContract.createHarbor("Helsingor"));
        assertTrue(adminContract.createHarbor("Copenhagen"));
        
        context.checking(new Expectations(){{
            List<HarborDTO> harbors = new ArrayList<HarborDTO>();
            harbors.add(new HarborDTO("Helsingor"));
            harbors.add(new HarborDTO("Copenhagen"));
            oneOf(customerContract).getAllHarbors();
            will(returnValue(harbors));
        }});
        
        List<HarborDTO> expectedHarbors = new ArrayList<HarborDTO>();
        expectedHarbors.add(new HarborDTO("Helsingor"));
        expectedHarbors.add(new HarborDTO("Copenhagen"));
        
        assertEquals(expectedHarbors.size(), customerContract.getAllHarbors().size());
        assertEquals(expectedHarbors.get(0).getCity(), "Helsingor");
        assertEquals(expectedHarbors.get(1).getCity(), "Copenhagen");
    }
    
    public void testGetHarborRoutes(){

        final HarborDTO harbor1 = new HarborDTO("Helsingor");
        final HarborDTO harbor2 = new HarborDTO("Copenhagen");
        
        context.checking(new Expectations(){{
            oneOf(adminContract).createRoute(harbor1, harbor2, new ArrayList(), 100, true);
            will(returnValue(true));
            oneOf(adminContract).createRoute(harbor2, harbor1, new ArrayList(), 100, true);
            will(returnValue(true));
        }});
        
        assertTrue(adminContract.createRoute(harbor1, harbor2, new ArrayList<DiscountDTO>(), 100, true));
        assertTrue(adminContract.createRoute(harbor2, harbor1, new ArrayList<DiscountDTO>(), 100, true));
        
        
        final List<RouteDTO> expectedRoutes = new ArrayList<RouteDTO>();
        expectedRoutes.add(new RouteDTO(harbor2, harbor1, new ArrayList(), 100, true));
        expectedRoutes.add(new RouteDTO(harbor1, harbor2, new ArrayList(), 100, true));
        
        context.checking(new Expectations(){{
            oneOf(customerContract).getHarborRoutes(1);
            will(returnValue(expectedRoutes));
        }});
        
        ArrayList<RouteDTO> createdRoutes = customerContract.getHarborRoutes(1);
        assertEquals(expectedRoutes.size(), createdRoutes.size());
        assertEquals(expectedRoutes.get(0).getPrice(), createdRoutes.get(0).getPrice());
        assertEquals(expectedRoutes.get(1).getPrice(), createdRoutes.get(1).getPrice());
    }
    
    public void testGetTimeTable() {
        final Time time1 = new Time(11111);
        final Time time2 = new Time(22222);
        final RouteDTO route = new RouteDTO(new HarborDTO("Copenhagen"), new HarborDTO("Malmo"), new ArrayList<DiscountDTO>(), 0, true);
        
        context.checking(new Expectations(){{
            oneOf(adminContract).createTimeTable(time1, time2, route);
            will(returnValue(true));
        }});
        
        assertTrue(adminContract.createTimeTable(time1, time2, route));
        
        context.checking(new Expectations(){{
            exactly(1).of(customerContract).getTimeTable(1);
            will(returnValue(new ArrayList<TimeTableDTO>()));
        }});
        
        assertEquals(new ArrayList<TimeTableDTO>(), customerContract.getTimeTable(1));
    }
}
