package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
    @Test
    void Is_FirstName_Valid_WithMinimumThreeChar_And_StartingLetterCapital() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validFirstName("Shubham");
        Assertions.assertTrue(result);
    }

    @Test
    void whenThe_FirstName_InValid() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validFirstName("shubham");
        Assertions.assertTrue(result);
    }

    @Test
    void Is_LastName_Valid_WithMinimumThreeChar_And_StartingLetterCapital() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validLastName("Bandagale");
        Assertions.assertTrue(result);
    }

    @Test
    void when_LastName_isInValid() throws UserRegistrationException {
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

    @Test
    void Is_Password_Valid_with_EightCharacters_Atleastone_CapitalLetter_Number_SpecialCharacter() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validPassword("Haywards@5000");
        Assertions.assertTrue(result);
    }

    @Test
    void whenCrendentialError_ShouldCheckForException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validUserRegistartion("Shubham", "Bandagale", "abc.xyz@bl.co.in", "91 9004608888", "Haywards@5000");
        Assertions.assertTrue(result);
    }
}
