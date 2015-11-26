/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awesome.ETO;

/**
 *
 * @author stefan
 */
public class FerryNoLevelsETO extends Exception {

    /**
     * Creates a new instance of <code>FerryNoLevelsETO</code> without detail
     * message.
     */
    public FerryNoLevelsETO() {
    }

    /**
     * Constructs an instance of <code>FerryNoLevelsETO</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FerryNoLevelsETO(String msg) {
        super(msg);
    }
}
