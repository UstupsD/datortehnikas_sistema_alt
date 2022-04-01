// This is an exception handler that is used, if request ID cannot be found.
package com.datortehnika.datortehnikas_sistema.exception;

public class requestNotFoundException extends RuntimeException {
    public requestNotFoundException(String message) {
        super (message);
    }
}
