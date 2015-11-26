/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awesome.DTO;

import com.awesome.ETO.FerryNoLevelsETO;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public class FerryDTO {
    private Integer id;
    /* each level will have a width and length size*/
    private Collection<LevelDTO> levels;
    private int year;
    private String OwnerMunicipality;
    private boolean active;
    
  /** 
    * This constructor should not be used to create a new ferry in the system 
     * @pre 
     *  @param id the unique identifier
     *  @param levels the different levels in a ferry
     *  @param year of construction 
     *  @param OwnerMunicipality the owner of the ferry
     *  @param active if a ferry will be disabled this should be false if the ferry is enabled this should be true
     *  @thorws  FerryNoLevelsETO if the there is no level in the ferry
     */
  
    public FerryDTO(Integer id, Collection<LevelDTO> levels, int year, String OwnerMunicipality, boolean active) throws FerryNoLevelsETO {
        if (levels.size()<1)
            throw new FerryNoLevelsETO("You can't create a ferry with no levels.");
        this.id = id;
        this.levels = levels;
         this.year = year;
        this.OwnerMunicipality = OwnerMunicipality;
        this.active = active;
    }
  /** 
    * This constructor should not be used to create a new ferry in the system 
     * @pre 
     *  @param levels the different levels in a ferry
     *  @param year of construction 
     *  @param OwnerMunicipality the owner of the ferry
     *  @param active if a ferry will be disabled this should be false if the ferry is enabled this should be true
     *  @thorws  FerryNoLevelsETO if the there is no level in the ferry
*/
  
    public FerryDTO(Collection<LevelDTO> levels, int year, String OwnerMunicipality, boolean active) throws FerryNoLevelsETO {
        if (levels.size()<1)
            throw new FerryNoLevelsETO("You can't create a ferry with no levels.");
        this.levels = levels;
        this.year = year;
        this.OwnerMunicipality = OwnerMunicipality;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public Collection<LevelDTO> getLevels() {
        return levels;
    }

    public boolean isActive() {
        return active;
    }


    public String getOwnerMunicipality() {
        return OwnerMunicipality;
    }

    public void setOwnerMunicipality(String OwnerMunicipality) {
        this.OwnerMunicipality = OwnerMunicipality;
    }


  

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    } 
    
}
