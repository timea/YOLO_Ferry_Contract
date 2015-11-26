/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awesome.DTO;

import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public class TimeTableDTO {
     private Integer id;
   
    private Time departureTime, arrivalTime;
    private FerryDTO ferry;
    /**
     * This constructor should not be used to create a new TimeTable
     * @pre 
     *  @param the unique identifier
     *  @param depatureTime from the starting point
     *  @param arrivalTime to the ending point
     *  @param the ferry that will be used in the journey
 
     */
    public TimeTableDTO(Integer id, Time departureTime, Time arrivalTime, FerryDTO ferry) {
        this.id = id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ferry = ferry; 
    }

    public Integer getId() {
        return id;
    }
  
    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setFerry(FerryDTO ferry) {
        this.ferry = ferry;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public FerryDTO getFerry() {
        return ferry;
    }

 
}
