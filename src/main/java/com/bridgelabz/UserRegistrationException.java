package com.bridgelabz;

/**
 * CUSTOM EXCEPTIONS IN CASE OF ANY INVLAID ENTRY
 */
public class UserRegistrationException extends Exception {
    enum ExceptionType {
        INVALID_FIRSTNAME,INVALID_LASTNAME,INVALID_EMAIL,INVALID_MOBILE_NUMBER,INVALID_PASSWORD_NUMBER,INVALID_CREDENTIALS ;
    }
    ExceptionType type;
    public UserRegistrationException(ExceptionType type, String message) {
        super(message);
        this.type = type;

    }
}