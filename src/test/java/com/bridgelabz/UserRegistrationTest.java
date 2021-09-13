package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    @Test
    void Is_FirstName_Valid_WithMinimumThreeChar_And_StartingLetterCapital() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validFirstName("Shubham");
        Assertions.assertTrue(result);
    }
    @Test
    void Is_LastName_Valid_WithMinimumThreeChar_And_StartingLetterCapital() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validLastName("Bandagale");
        Assertions.assertTrue(result);
    }
    @Test
    void Is_Email_Valid() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    void Is_PhoneNumber_with_CountryCode_and_Space() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validPhoneNumber("91 9000345555");
        Assertions.assertTrue(result);
    }
}
