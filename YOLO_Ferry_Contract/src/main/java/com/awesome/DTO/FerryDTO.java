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
public class FerryDTO {
    
    private String size;
    private ArrayList<RouteDTO> route;
    private boolean booked;
    private int year;
    private String OwnerMunicipality;

    public FerryDTO(String size, ArrayList<RouteDTO> route, boolean booked, int year, String OwnerMunicipality) {
        this.size = size;
        this.route = route;
        this.booked = booked;
        this.year = year;
        this.OwnerMunicipality = OwnerMunicipality;
    }

    public String getOwnerMunicipality() {
        return OwnerMunicipality;
    }

    public void setOwnerMunicipality(String OwnerMunicipality) {
        this.OwnerMunicipality = OwnerMunicipality;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ArrayList<RouteDTO> getRoute() {
        return route;
    }

    public void setRoute(ArrayList<RouteDTO> route) {
        this.route = route;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
