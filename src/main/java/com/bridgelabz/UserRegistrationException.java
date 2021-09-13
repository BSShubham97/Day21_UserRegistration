package com.bridgelabz;
public class UserRegistrationException extends Exception {
    enum ExceptionType {
        INVALID_FIRSTNAME;
    }
    ExceptionType type;
    public UserRegistrationException(ExceptionType type, String message) {
        super(message);
        this.type = type;

    }
}