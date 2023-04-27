package com.employeeRest.exceptionHandlers;

public class exception extends RuntimeException{
    public exception(String message, Throwable cause) {
        super(message, cause);
    }

    public exception(String message){
        super(message);
    }
}
