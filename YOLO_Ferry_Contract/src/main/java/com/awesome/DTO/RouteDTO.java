/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awesome.DTO;

import java.util.ArrayList;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public class RouteDTO {
    
    private HarborDTO departure, arrival;
    private ArrayList<DiscountDTO> discounts;
    private double price;
    private boolean carsAllowed;

    public RouteDTO(HarborDTO departure, HarborDTO arrival, ArrayList<DiscountDTO> discounts, double price, boolean carsAllowed) {
        this.departure = departure;
        this.arrival = arrival;
        this.discounts = discounts;
        this.price = price;
        this.carsAllowed = carsAllowed;
    }
    
    

    public ArrayList<DiscountDTO> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(ArrayList<DiscountDTO> discounts) {
        this.discounts = discounts;
    }

    public boolean isCarsAllowed() {
        return carsAllowed;
    }

    public void setCarsAllowed(boolean carsAllowed) {
        this.carsAllowed = carsAllowed;
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
