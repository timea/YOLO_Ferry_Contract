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
public class NoAccountETO extends Exception {
    
    public NoAccountETO(String message) {
        super(message);
    }
    
}