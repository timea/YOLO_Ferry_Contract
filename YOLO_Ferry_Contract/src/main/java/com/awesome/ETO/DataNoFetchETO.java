/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awesome.ETO;

/**
 * This exception is thrown when we can't fetch all the data from the DB
 * @author stefan
 */
public class DataNoFetchETO extends Exception {

    /**
     * Creates a new instance of <code>DataNoFetchETO</code> without detail
     * message.
     */
    public DataNoFetchETO() {
    }

    /**
     * Constructs an instance of <code>DataNoFetchETO</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public DataNoFetchETO(String msg) {
        super(msg);
    }
}
