package com.awesome.yolo_ferry_contract;

import com.awesome.DTO.BookingDTO;
import com.awesome.DTO.HarborDTO;
import com.awesome.DTO.RouteDTO;
import com.awesome.DTO.TimeTableDTO;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public interface CustomerContract {
    /**
     * Books a ticket for one or more people and their vehicle
     * @param booking all the needed information to book a ticket/tickets for a user
     * @return the result if the booking was successfully made or not
     */
    public boolean createBooking(BookingDTO booking);
    /**
     * This will return all the data about the different routes in the system
     * This will include harbors and timetables
     * @return the list with all the routes in the system 
     */
    public Collection<RouteDTO> getRouteList();
}
