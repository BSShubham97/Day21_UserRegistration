package com.bridgelabz;

import java.util.regex.Pattern;

/**
 * USER VALIDATION NEEDS TO ENSURE ALL VALIDATIONS ARE IN PLACE DURING THE USING ENTRY
 */
public class UserRegistration {
    private static final String FIRST_NAME_PATTERN= ("^[A-Z]{1}[a-z]{2,}");
    private static final String LAST_NAME_PATTERN= ("^[A-Z]{1}[a-z]{2,}");
    private static final String EMAIL_PATTERN= ("[a-zA-Z]+[.]*[a-zA-Z]*[@][b][l][.][c][o][.]*[in]*");

    public boolean validFirstName(String firstName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        if (pattern.matcher(firstName).matches() != true)
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_FIRSTNAME, "ENTER VALID FIRSTNAME: First Letter Capital and Minimum Three characters");
        else
            return pattern.matcher(firstName).matches();
    }
    public boolean validLastName(String lastName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        if(pattern.matcher(lastName).matches()!=true)
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_LASTNAME, "ENTER VALID LASTNAME: First Letter Capital and Minimum Three characters");
        else
            return pattern.matcher(lastName).matches();
    }
    public boolean validEmail(String email) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        if(pattern.matcher(email).matches()!=true)
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_EMAIL, "ENTER VALID EMAIL");
        else
            return pattern.matcher(email).matches();
    }


}
