/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awesome.ETO;

/**
 *
 * @author stefan
 * this Exception is thrown when we can't execute one or more operations in the db
 * all operations should be atomic
 */
public class DataNoTransactionDTO extends Exception {

    /**
     * Creates a new instance of <code>DataNoTransactionDTO</code> without
     * detail message.
     */
    public DataNoTransactionDTO() {
    }

    /**
     * Constructs an instance of <code>DataNoTransactionDTO</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DataNoTransactionDTO(String msg) {
        super(msg);
    }
}
