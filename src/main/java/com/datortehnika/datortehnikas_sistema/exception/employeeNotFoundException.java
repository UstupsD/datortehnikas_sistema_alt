// This is an exception handler that is used, if an employee ID cannot be found.
package com.datortehnika.datortehnikas_sistema.exception;

public class employeeNotFoundException extends RuntimeException {
    public employeeNotFoundException(String message) {
        super(message);
    }
}
