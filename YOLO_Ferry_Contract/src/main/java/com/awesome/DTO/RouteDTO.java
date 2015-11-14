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
public class RouteDTO {
    
    private HarborDTO departure, arrival;
    private Collection<DiscountDTO> discounts;
    private Collection<FerryDTO> ferries;
    private double price;
    private boolean carsAllowed;

    public RouteDTO(HarborDTO departure, HarborDTO arrival, Collection<DiscountDTO> discounts, Collection<FerryDTO> ferries, double price, boolean carsAllowed) {
        this.departure = departure;
        this.arrival = arrival;
        this.discounts = discounts;
        this.ferries = ferries;
        this.price = price;
        this.carsAllowed = carsAllowed;
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

    public Collection<DiscountDTO> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Collection<DiscountDTO> discounts) {
        this.discounts = discounts;
    }

    public Collection<FerryDTO> getFerries() {
        return ferries;
    }

    public void setFerries(Collection<FerryDTO> ferries) {
        this.ferries = ferries;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCarsAllowed() {
        return carsAllowed;
    }

    public void setCarsAllowed(boolean carsAllowed) {
        this.carsAllowed = carsAllowed;
    }
    
}
