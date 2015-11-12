/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awesome.yolo_ferry_contract;

import com.awesome.DTO.DiscountDTO;
import com.awesome.DTO.FerryDTO;
import com.awesome.DTO.HarborDTO;
import com.awesome.DTO.RouteDTO;
import java.sql.Time;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;

/**
 *
 * @author Adrian Dimitrov
 */
public class AdminContractTest extends TestCase {
    
    public AdminContractTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getAllRoutes method, of class AdminContract.
     */
    public void testGetAllRoutes() {
        System.out.println("getAllRoutes");
        AdminContract instance = new AdminContractImpl();
        ArrayList<RouteDTO> expResult = null;
        ArrayList<RouteDTO> result = instance.getAllRoutes();
        assertNotSame(expResult, result);
    }

    /**
     * Test of createFerry method, of class AdminContract.
     */
    public void testCreateFerry() {
        System.out.println("createFerry");
        String size = "big";
        ArrayList<RouteDTO> route;
        route = new ArrayList();
        RouteDTO rdto = new RouteDTO(null, null, null , 600.0, true);
        route.add(rdto);
        int year = 2017;
        String OwnerMunicipality = "Random";
        AdminContract instance = new AdminContractImpl();
        boolean result = instance.createFerry(size, route, year, OwnerMunicipality);
        assertTrue(result);
    }

    /**
     * Test of editFerry method, of class AdminContract.
     */
    public void testEditFerry() {
        System.out.println("editFerry");
        int ferryID = 147;
        String size = "big";
        ArrayList<RouteDTO> route;
        route = new ArrayList();
        RouteDTO rdto = new RouteDTO(null, null, null , 600.0, true);
        route.add(rdto);
        int year = 2017;
        String OwnerMunicipality = "Random";
        AdminContract instance = new AdminContractImpl();
        FerryDTO result = instance.editFerry(ferryID, size, route, year, OwnerMunicipality);
        assertEquals(size, result.getSize());
        assertEquals(route, result.getRoute());
        assertEquals(year, result.getYear());
        assertEquals(OwnerMunicipality, result.getOwnerMunicipality());
    }

    /**
     * Test of createRoute method, of class AdminContract.
     */
    public void testCreateRoute() {
        System.out.println("createRoute");
        HarborDTO departure =  new HarborDTO("AArhus");
        HarborDTO arrival = new HarborDTO("Bornholm");
        ArrayList<DiscountDTO> discounts = new ArrayList();
        DiscountDTO ddto = new DiscountDTO(2, "friend");
        discounts.add(ddto);
        double price = 1500.0;
        boolean carsAllowed = true;
        AdminContract instance = new AdminContractImpl();
        boolean result = instance.createRoute(departure, arrival, discounts, price, carsAllowed);
        assertTrue(result);
    }

    /**
     * Test of editRoute method, of class AdminContract.
     */
    public void testEditRoute() {
        System.out.println("editRoute");
        int routeID = 380;
        HarborDTO departure =  new HarborDTO("AArhus");
        HarborDTO arrival = new HarborDTO("Bornholm");
        ArrayList<DiscountDTO> discounts = new ArrayList();
        DiscountDTO ddto = new DiscountDTO(2, "friend");
        discounts.add(ddto);
        double price = 1500.0;
        boolean carsAllowed = true;
        AdminContract instance = new AdminContractImpl();
        RouteDTO result = instance.editRoute(routeID, departure, arrival, discounts, price, carsAllowed);
        assertEquals(departure, result.getDeparture());
        assertEquals(arrival, result.getArrival());
        assertEquals(discounts, result.getDiscounts());
        assertEquals(price, result.getPrice());
        assertEquals(carsAllowed, result.isCarsAllowed());
    }

    /**
     * Test of createHarbor method, of class AdminContract.
     */
    public void testCreateHarbor() {
        System.out.println("createHarbor");
        String name = "Galibad";
        AdminContract instance = new AdminContractImpl();
        boolean result = instance.createHarbor(name);
        assertTrue(result);
    }

    /**
     * Test of editHarbor method, of class AdminContract.
     */
    public void testEditHarbor() {
        System.out.println("editHarbor");
        int harborID = 36;
        String name = "Galibad";
        AdminContract instance = new AdminContractImpl();
        HarborDTO result = instance.editHarbor(harborID, name);
        assertEquals(name, result.getCity());
    }
    public void testCreateTimeTable(){
        System.out.println("Create Time Table");
        Time departure = new Time(134);
        Time arrival = new Time(178);
        RouteDTO route = new RouteDTO(new HarborDTO("Copenhagen"), new HarborDTO("Gildbin"), null, 1500.0, true);
        AdminContract instance = new AdminContractImpl();
        boolean result = instance.createTimeTable(departure, arrival, route);
        assertTrue(result);
    }

    public class AdminContractImpl implements AdminContract {

        public ArrayList<RouteDTO> getAllRoutes() {
            return null;
        }

        public boolean createFerry(String size, ArrayList<RouteDTO> route, int year, String OwnerMunicipality) {
            return false;
        }

        public FerryDTO editFerry(int ferryID, String size, ArrayList<RouteDTO> route, int year, String OwnerMunicipality) {
            return null;
        }

        public boolean createRoute(HarborDTO departure, HarborDTO arrival, ArrayList<DiscountDTO> discounts, double price, boolean carsAllowed) {
            return false;
        }

        public RouteDTO editRoute(int routeID, HarborDTO departure, HarborDTO arrival, ArrayList<DiscountDTO> discounts, double price, boolean carsAllowed) {
            return null;
        }

        public boolean createHarbor(String name) {
            return false;
        }

        public HarborDTO editHarbor(int harborID, String name) {
            return null;
        }

        public boolean createTimeTable(Time departure, Time arrival, RouteDTO route) {
           return false;    
        }
    }
    
}
