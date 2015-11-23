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
import com.awesome.DTO.TimeTableDTO;
import java.sql.Time;
import java.util.Collection;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public interface AdminContract {
     public Collection<RouteDTO> getAllRoutes();
   
    //manage ferries use case
    public Collection<FerryDTO> getAllFerries();
    public boolean createFerry(String size, Collection<RouteDTO> route, int year, String OwnerMunicipality);
    public FerryDTO editFerry(int ferryID, String size, Collection<RouteDTO> route, int year, String OwnerMunicipality);
    
}
