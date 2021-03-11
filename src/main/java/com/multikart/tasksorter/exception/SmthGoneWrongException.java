package com.multikart.tasksorter.exception;

public class SmthGoneWrongException extends RuntimeException{
    public SmthGoneWrongException() {
    }

    public SmthGoneWrongException(String message) {
        super(message);
    }

    public SmthGoneWrongException(Throwable cause) {
        super(cause);
    }
}
