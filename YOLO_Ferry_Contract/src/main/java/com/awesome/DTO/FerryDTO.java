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
    private boolean booked;
    private int year;
    private String OwnerMunicipality;
    private boolean active;

    public FerryDTO(String size, boolean booked, int year, String OwnerMunicipality, boolean active) {
        this.size = size;
        this.booked = booked;
        this.year = year;
        this.OwnerMunicipality = OwnerMunicipality;
        this.active=active;
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
