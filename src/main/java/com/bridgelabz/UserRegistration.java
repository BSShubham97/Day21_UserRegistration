package com.bridgelabz;

import java.util.regex.Pattern;

/**
 * USER VALIDATION NEEDS TO ENSURE ALL VALIDATIONS ARE IN PLACE DURING THE USING ENTRY
 */
public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = ("^[A-Z]{1}[a-z]{2,}");
    private static final String LAST_NAME_PATTERN = ("^[A-Z]{1}[a-z]{2,}");
    private static final String EMAIL_PATTERN = ("[a-zA-Z]+[.]*[a-zA-Z]*[@][b][l][.][c][o][.]*[in]*");
    private static final String PHONE_PATTERN = ("[9][1](?:\\s|-)*[0-9]{10}");
    private static final String PASSWORD_PATTERN = "(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%-><.]{1}).{8,}";

    public boolean validFirstName(String firstName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        if (pattern.matcher(firstName).matches() != true)
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_FIRSTNAME, "ENTER VALID FIRSTNAME: First Letter Capital and Minimum Three characters");
        else
            return pattern.matcher(firstName).matches();
    }

    public boolean validLastName(String lastName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        if (pattern.matcher(lastName).matches() != true)
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_LASTNAME, "ENTER VALID LASTNAME: First Letter Capital and Minimum Three characters");
        else
            return pattern.matcher(lastName).matches();
    }

    public boolean validEmail(String email) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        if (pattern.matcher(email).matches() != true)
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_EMAIL, "ENTER VALID EMAIL");
        else
            return pattern.matcher(email).matches();
    }

    public boolean validPhoneNumber(String phonenumber) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        if (pattern.matcher(phonenumber).matches() != true)
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER, "ENTER VALID MOBILE FORMAT: Enter correct number with 91 as country code");
        else
            return pattern.matcher(phonenumber).matches();
    }
    public boolean validPassword(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        if (pattern.matcher(password).matches()!=true)
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_PASSWORD_NUMBER, "ENTER VALID PASSWORD : Enter Minimum 8 characters/ Atleast 1: UpperCase Letter/ Atleast 1: Number/ 1 Special Character");
        else
            return pattern.matcher(password).matches();
    }
}
