// This is an exception handler that is used, if an employee ID cannot be found.
package com.datortehnika.datortehnikas_sistema.exception;

public class userNotFoundException extends RuntimeException {
    public userNotFoundException(String message) {
        super(message);
    }
}
