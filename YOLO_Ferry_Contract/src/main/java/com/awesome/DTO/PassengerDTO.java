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
public class PassengerDTO {
    
    private String cpr,firstName, lastName, address, phone;
    private boolean hasPermanentAddress;
  /**
     * @pre 
     *  @param cpr the unique identifier
     *  @param firstName
     *  @param lastName
     *  @param address of the passenger
     *  @param phone
     *  @param hasPermanentAddress will tell the system if the passenger is a resident or not
     */
  
    public PassengerDTO(String cpr, String firstName, String lastName, String address, String phone, boolean hasPermanentAddress) {
        this.cpr = cpr;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.hasPermanentAddress = hasPermanentAddress;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getCpr() {
        return cpr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public boolean isHasPermanentAddress() {
        return hasPermanentAddress;
    }

    public void setHasPermanentAddress(boolean hasPermanentAddress) {
        this.hasPermanentAddress = hasPermanentAddress;
    }
    
    
    
}
