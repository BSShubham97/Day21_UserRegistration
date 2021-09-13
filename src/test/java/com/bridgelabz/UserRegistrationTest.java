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
}