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
public class CrewReportDTO {
    
    private FerryDTO ferry;
    private String message;

    public FerryDTO getFerry() {
        return ferry;
    }

    public void setFerry(FerryDTO ferry) {
        this.ferry = ferry;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
