/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awesome.DTO;

/**
 *
 * @author stefan
 */
public class HarborDTO {
    private String city;
    //to do refactor it into ENUM
    private LandFormDTO landform;

    public HarborDTO(String city, LandFormDTO landform) {
        this.city = city;
        this.landform = landform;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLandform(LandFormDTO landform) {
        this.landform = landform;
    }

    public LandFormDTO getLandform() {
        return landform;
    }
    
}
