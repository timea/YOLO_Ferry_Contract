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
public class DiscountDTO {
    
    private int discountPercent;
    private String description;

    public DiscountDTO(int discountPercent, String description) {
        this.discountPercent = discountPercent;
        this.description = description;
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    
    
}
