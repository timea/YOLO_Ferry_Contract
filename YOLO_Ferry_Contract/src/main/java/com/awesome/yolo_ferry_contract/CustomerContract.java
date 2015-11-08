/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    public ArrayList<HarborDTO> getAllHarbors();
    //list of possible routes based on the departure harbor
    public ArrayList<RouteDTO> getHarborRoutes(int harborID);
    public ArrayList<TimeTableDTO> getTimeTable(int routeID);
    public boolean createBooking(BookingDTO booking);
    
}
