/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awesome.DTO;

import java.util.Collection;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public class BookingDTO {
    private Integer totalNoPassengers;
    private PassengerDTO Passangers;
    private VehicleDTO vehicle;
    private RouteDTO goRoute,backRoute;
  /** 
     * @pre 
     *  @param totalNoPassangers included the ticket
     *  @param VehicleDTO which can be null
     *  @param goRoute for going this is mandatory
     *  @param backRoute for return, this is optional
  */
    public BookingDTO(Integer totalNoPassangers, PassengerDTO Passengers, VehicleDTO vehicle, RouteDTO route, RouteDTO backRoute) {
        this.totalNoPassengers = totalNoPassangers;
        this.Passangers = Passengers;
        this.vehicle = vehicle;
        this.goRoute = goRoute;
        this.backRoute=backRoute;
    }
    
    private String bookingTime;
   
    public RouteDTO getRoute() {
        return goRoute;
    }

    public void setRoute(RouteDTO route) {
        this.goRoute = route;
    }

  

    public VehicleDTO getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDTO vehicle) {
        this.vehicle = vehicle;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public void setTotalNoPassangers(Integer totalNoPassangers) {
        this.totalNoPassengers = totalNoPassangers;
    }

    public void setPassangers(PassengerDTO Passangers) {
        this.Passangers = Passangers;
    }

    public Integer getTotalNoPassangers() {
        return totalNoPassengers;
    }

    public PassengerDTO getPassangers() {
        return Passangers;
    }

    
   
}
