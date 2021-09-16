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
    //    private static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%-><.]{1}).{8,}";
    private static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}";

    public boolean validFirstName(String firstName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        try {
            if (pattern.matcher(firstName).matches() != true)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_FIRSTNAME, "ENTER VALID FIRSTNAME: First Letter Capital and Minimum Three characters");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
        return pattern.matcher(firstName).matches();
    }

    public boolean validLastName(String lastName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        try {
            if (pattern.matcher(lastName).matches() != true)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_LASTNAME, "ENTER VALID LASTNAME: First Letter Capital and Minimum Three characters");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
        return pattern.matcher(lastName).matches();
    }

    public boolean validEmail(String email) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        try {
            if (pattern.matcher(email).matches() != true)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_EMAIL, "ENTER VALID EMAIL");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
        return pattern.matcher(email).matches();
    }

    public boolean validPhoneNumber(String phonenumber) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        try {
            if (pattern.matcher(phonenumber).matches() != true)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER, "ENTER VALID MOBILE FORMAT: Enter correct number with 91 as country code");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
        return pattern.matcher(phonenumber).matches();
    }

    public boolean validPassword(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        try {
            if (pattern.matcher(password).matches() != true)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_PASSWORD_NUMBER, "ENTER VALID PASSWORD : Enter Minimum 8 characters/ Atleast 1: UpperCase Letter/ Atleast 1: Number/ 1 Special Character");
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
        return pattern.matcher(password).matches();
    }

    public boolean validUserRegistartion(String firstName, String lastname, String email, String phonenumber, String password) {
        Pattern patternFirstName = Pattern.compile(FIRST_NAME_PATTERN);
        Pattern patternLastName = Pattern.compile(LAST_NAME_PATTERN);
        Pattern patternEmail = Pattern.compile(EMAIL_PATTERN);
        Pattern patternPhonenum = Pattern.compile(PHONE_PATTERN);
        Pattern patternPassword = Pattern.compile(PASSWORD_PATTERN);
        try {
            if
            (patternFirstName.matcher(firstName).matches() != true ||
                    patternLastName.matcher(lastname).matches() != true ||
                    patternEmail.matcher(email).matches() != true ||
                    patternPhonenum.matcher(phonenumber).matches() != true ||
                    patternPassword.matcher(password).matches() != true)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_CREDENTIALS, "Please Check for proper entry according to pattern");
            else
                return true;
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }

        return false;
    }
}
