/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awesome.DTO;

import java.util.Collection;

/**
 *
 * @author stefan
 */
public class RouteDTO {
     private Integer id;
   
    private HarborDTO startPoint, endPoint;
    /* true if only residents can bring their cars*/
    private boolean onlyResidentialVehicles;
    private Collection<TimeTableDTO> timeTables;
    //it's better to work with Integer for price and then devided by 100
    private Integer passangerPrice,vehiclePrice;
    /**
     * This constructor should not be used to create a new route
     * @pre 
     *  @param id the unique identifier
     *  @param startPoint
     *  @param endPoint
     *  @param onlyResidentialVehicles will tell us if the buyer of the ticket will need special permissions to take a vehicle to that ending point
     *  @param TimeTableDTO represents the diffrent timetables for that route, and each TimeTable will have a ferry assigned to it
     *  @param passangerPrice  the price per passenger
     *  @param priceCar the vehicle price
     */
    public RouteDTO(Integer id, HarborDTO startPoint, HarborDTO endPoint, boolean onlyResidentialVehicles, Collection<TimeTableDTO> timeTables, Integer passangerPrice, Integer vehiclePrice) {
        this.id = id;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.onlyResidentialVehicles = onlyResidentialVehicles;
        this.timeTables = timeTables;
        this.passangerPrice = passangerPrice;
        this.vehiclePrice = vehiclePrice;
    }

    

    public Integer getId() {
        return id;
    }

    public Integer getPassangerPrice() {
        return passangerPrice;
    }

    public Integer getCarPrice() {
        return vehiclePrice;
    }

    public void setPassangerPrice(Integer passangerPrice) {
        this.passangerPrice = passangerPrice;
    }

    public void setCarPrice(Integer carPrice) {
        this.vehiclePrice = carPrice;
    }
   

    public HarborDTO getStartPoint() {
        return startPoint;
    }

    public HarborDTO getEndPoint() {
        return endPoint;
    }

    public boolean isOnlyResidentialVehicles() {
        return onlyResidentialVehicles;
    }

    public Collection<TimeTableDTO> getTimeTables() {
        return timeTables;
    }

    public void setStartPoint(HarborDTO startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(HarborDTO endPoint) {
        this.endPoint = endPoint;
    }

    public void setOnlyResidentialVehicles(boolean onlyResidentialVehicles) {
        this.onlyResidentialVehicles = onlyResidentialVehicles;
    }

    public void setTimeTables(Collection<TimeTableDTO> timeTables) {
        this.timeTables = timeTables;
    }
    
}
