// This is an exception handler that is used, if tech ID cannot be found.
package com.datortehnika.datortehnikas_sistema.exception;

public class techNotFoundException extends RuntimeException {
    public techNotFoundException(String message) {
        super (message);
    }
}
