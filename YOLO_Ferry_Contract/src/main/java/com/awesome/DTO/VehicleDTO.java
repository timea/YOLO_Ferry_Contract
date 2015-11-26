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
public class VehicleDTO {
      private Integer id;
   
    private double length,width;
    private VehicleTypeDTO type;
    private String registrationNumber;
    /**
     * Create new Vehicle
     * @pre 
     *  @param length of the vehicle
     *  @param width of the vehicle
     *  @param BehicleTypeDTO represents the weight of the vehicle
     *  @param registrationNumber is the unique identifier 
     * @post
     *  The Object created by this constructor will be used to register a new vehicle in the System.
     */
    public VehicleDTO(double length, double width, VehicleTypeDTO type, String registrationNumber) {
        this.length = length;
        this.width = width;
        this.type = type;
        this.registrationNumber = registrationNumber;
    }

    public Integer getId() {
        return id;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setType(VehicleTypeDTO type) {
        this.type = type;
    }

    public VehicleTypeDTO getType() {
        return type;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    
    
}
