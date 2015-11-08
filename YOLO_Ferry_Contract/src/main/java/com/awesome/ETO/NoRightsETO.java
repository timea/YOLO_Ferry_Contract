/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.awesome.ETO;

/**
 *
 * @author Timea Kiss <cph-tk10@cphbusiness.dk>
 */
public class NoRightsETO extends Exception {
    
    public String message = "You do not seem to have the proper rights";
    
    public NoRightsETO(String message) {
        super(message);
    }
    
}