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
     * @pre
     *  @param booking all the needed information to book a ticket/tickets for a user
     * @throws DataNoTransactionDTO the booking could not be created
     * @post
     *  @return the result if the booking was successfully made or not
     */
    public boolean createBooking(BookingDTO booking);
    /**
     * This will return all the data about the different routes in the system
     * This will include harbors and timetables
     * @pre 
     *  @throws DataNoFetchETO if the data can't be fetched
     * @post return all information about the different routes
     *  @return the Collection with all the routes in the system 
     */
    public Collection<RouteDTO> getRouteList();
}
