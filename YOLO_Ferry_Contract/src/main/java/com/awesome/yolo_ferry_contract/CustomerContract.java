package com.awesome.yolo_ferry_contract;

import com.awesome.DTO.BookingDTO;
import com.awesome.DTO.HarborDTO;
import com.awesome.DTO.RouteDTO;
import com.awesome.DTO.TimeTableDTO;
import java.util.ArrayList;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public interface CustomerContract {
    
    //Select trip
    public ArrayList<HarborDTO> getAllHarbors();
    public ArrayList<RouteDTO> getHarborRoutes(int harborID);
    public ArrayList<TimeTableDTO> getTimeTable(int routeID);
    //create booking
    public boolean createBooking(BookingDTO booking);
    
}
