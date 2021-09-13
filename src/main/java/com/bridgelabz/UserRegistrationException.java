package com.bridgelabz;
public class UserRegistrationException extends Exception {
    enum ExceptionType {
        INVALID_FIRSTNAME,INVALID_LASTNAME,INVALID_EMAIL ;
    }
    ExceptionType type;
    public UserRegistrationException(ExceptionType type, String message) {
        super(message);
        this.type = type;

    }
}