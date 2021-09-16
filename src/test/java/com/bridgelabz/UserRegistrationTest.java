package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
    /**
     * FIRST NAME
     * @throws UserRegistrationException when invalid entry such as FirstLetter not capital
     */
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

    /**
     * LAST NAME
     * @throws UserRegistrationException when invalid entry such as LastName FirstLetter not capital
     */
    @Test
    void Is_LastName_Valid_WithMinimumThreeChar_And_StartingLetterCapital() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validLastName("Bandagale");
        Assertions.assertTrue(result);
    }

    @Test
    void when_LastName_isInValid() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validLastName("andagale");
        Assertions.assertTrue(result);
    }

    /**
     * EMAIL
     * @throws UserRegistrationException when invalid entry such as not according to email pattern
     */
    @Test
    void Is_Email_Valid() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    void when_Email_isInValid() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validEmail("abc.xyzbl.co.in");
        Assertions.assertTrue(result);
    }

    /**
     * PHONE NUMBER
     * @throws UserRegistrationException when invalid entry such as no country code and space or 10 digits
     */
    @Test
    void Is_PhoneNumber_with_CountryCode_and_Space() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validPhoneNumber("91 9000345555");
        Assertions.assertTrue(result);
    }

    @Test
    void when_PhoneNumber_isInValid() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validPhoneNumber("9000345555");
        Assertions.assertTrue(result);
    }

    /**
     * PASSWORD
     * @throws UserRegistrationException when invalid entry such as missing  EightCharacters,Atleastone_CapitalLetter,Number or SpecialCharacter
     */
    @Test
    void Is_Password_Valid_with_EightCharacters_Atleastone_CapitalLetter_Number_SpecialCharacter() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validPassword("Haywards@5000");
        Assertions.assertTrue(result);
    }

    @Test
    void when_Password_isInValid() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validPassword("aywards5000");
        Assertions.assertTrue(result);
    }

    @Test
    void whenCrendentialError_ShouldCheckForException() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validUserRegistartion("Shubham", "Bandagale", "abc.xyz@bl.co.in", "91 9004608888", "Haywards@5000");
        Assertions.assertTrue(result);
    }
}
