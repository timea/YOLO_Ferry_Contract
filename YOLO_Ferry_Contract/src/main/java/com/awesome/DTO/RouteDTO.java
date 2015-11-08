/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awesome.DTO;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public class RouteDTO {
    
    private HarborDTO departure, arrival;
    private DiscountDTO residentDiscount;
    private String season;
    private double price;
    private boolean carsAllowed;

    public DiscountDTO getResidentDiscount() {
        return residentDiscount;
    }

    public void setResidentDiscount(DiscountDTO residentDiscount) {
        this.residentDiscount = residentDiscount;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HarborDTO getDeparture() {
        return departure;
    }

    public void setDeparture(HarborDTO departure) {
        this.departure = departure;
    }

    public HarborDTO getArrival() {
        return arrival;
    }

    public void setArrival(HarborDTO arrival) {
        this.arrival = arrival;
    }
    
    

    
    
    
}
