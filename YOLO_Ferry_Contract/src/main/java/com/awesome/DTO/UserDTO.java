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
public class UserDTO {
    
    private String firstName, lastName, address, phone;
    private boolean hasPermanentAddress, hasCar;

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

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public boolean isHasPermanentAddress() {
        return hasPermanentAddress;
    }

    public void setHasPermanentAddress(boolean hasPermanentAddress) {
        this.hasPermanentAddress = hasPermanentAddress;
    }
    
    
    
}
