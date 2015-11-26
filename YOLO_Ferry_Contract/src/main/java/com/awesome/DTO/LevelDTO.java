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
public class LevelDTO {
    private Integer length,width;
  /**
   * Represents the level of a ferry
     * @pre 
     *  @param length of the level space
     *  @param width of the level width
     */
  
    public LevelDTO(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
    
}
