package com.bridgelabz;

import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    private UserRegistration userRegistration;

    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstNameExpectedAsTrue() throws UserRegistrationException {
        boolean actualOutput = userRegistration.firstNameValidation("Manoj");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenFirstNameExpectedAsFalse() throws UserRegistrationException {
        try {
            boolean actualOutput = userRegistration.firstNameValidation("manoj");
            assertEquals(false, actualOutput);
        } catch (UserRegistrationException userRegistrationException) {
            userRegistrationException.printStackTrace();
        }
    }

    @Test
    public void givenLastNameExpectedAsTrue() throws UserRegistrationException {
        boolean actualOutput = userRegistration.lastNameValidation("Pabbisetty");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenLastNameExpectedAsFalse() throws UserRegistrationException {
        try {
            boolean actualOutput = userRegistration.lastNameValidation("pabbisetty");
            assertEquals(false, actualOutput);
        } catch (UserRegistrationException userRegistrationException) {
            userRegistrationException.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumberExpectedAsTrue() throws UserRegistrationException {
        boolean actualOutput = userRegistration.userMobileNumberValidation("+91 8331880950");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenMobileNumberExpectedAsFalse() throws UserRegistrationException {
        try {
            boolean actualOutput = userRegistration.userMobileNumberValidation("+918331880950");
            assertEquals(false, actualOutput);
        } catch (UserRegistrationException userRegistrationException) {
            userRegistrationException.printStackTrace();
        }
    }

    @Test
    public void enteredEmailsExpectedAsTrue() throws UserRegistrationException {
        boolean actualOutput = userRegistration.userEmailValidation("manojP1@gmail.com");
        assertEquals(true, actualOutput);
    }

    @Test
    public void enteredEmailsExpectedAsFalse() throws UserRegistrationException {
        try {
            boolean actualOutput = userRegistration.userEmailValidation("manojP1.@.gmail.com");
            assertEquals(false, actualOutput);
        } catch (UserRegistrationException userRegistrationException) {
            userRegistrationException.printStackTrace();
        }
    }

    @Test
    public void givenPasswordExpectedAsTrue() throws UserRegistrationException {
        boolean actualOutput = userRegistration.userPasswordValidation("Manoj@451");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenPasswordExpectedAsFalse() throws UserRegistrationException {
        try {
            boolean actualOutput = userRegistration.userPasswordValidation("manoj451");
            assertEquals(false, actualOutput);
        } catch (UserRegistrationException userRegistrationException) {
            userRegistrationException.printStackTrace();
        }
    }
}