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
    
    private RouteDTO route;
    private int passengers;
    private AccountDTO userAccount;
    private int vehicles;
    private VehicleDTO vehicle;
    private String bookingTime;
    private Collection<DiscountDTO> discount;

    public RouteDTO getRoute() {
        return route;
    }

    public void setRoute(RouteDTO route) {
        this.route = route;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public AccountDTO getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(AccountDTO userAccount) {
        this.userAccount = userAccount;
    }

    public int getVehicles() {
        return vehicles;
    }

    public void setVehicles(int vehicles) {
        this.vehicles = vehicles;
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

    public Collection<DiscountDTO> getDiscount() {
        return discount;
    }

    public void setDiscount(Collection<DiscountDTO> discount) {
        this.discount = discount;
    }

   
    
    
    
}
