/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awesome.yolo_ferry_contract;

import com.awesome.DTO.DiscountDTO;
import com.awesome.DTO.FerryDTO;
import com.awesome.DTO.HarborDTO;
import com.awesome.DTO.RouteDTO;
import java.util.ArrayList;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public interface AdminContract {
    
    //manage ferries use case
    public ArrayList<RouteDTO> getAllRoutes();
    public boolean createFerry(String size, ArrayList<RouteDTO> route, int year, String OwnerMunicipality);
    public FerryDTO editFerry(int ferryID, String size, ArrayList<RouteDTO> route, int year, String OwnerMunicipality);
    
    //manage routes
    public boolean createRoute(HarborDTO departure, HarborDTO arrival, ArrayList<DiscountDTO> discounts, double price, boolean carsAllowed);
    public RouteDTO editRoute(int routeID, HarborDTO departure, HarborDTO arrival, ArrayList<DiscountDTO> discounts, double price, boolean carsAllowed);
    
    //magane harbors   
    public boolean createHarbor(String name);
    public HarborDTO editHarbor(int harborID, String name);
}
