package com.bridgelabz;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    private static UserRegistration userRegistration = new UserRegistration();


    @Test
    public void givenFirstNameExpectedAsTrue() {
        boolean actualOutput = userRegistration.firstNameValidation("Manoj");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenFirstNameExpectedAsFalse() {
        boolean actualOutput = userRegistration.firstNameValidation("manoj");
        assertEquals(false, actualOutput);
    }

    @Test
    public void givenLastNameExpectedAsTrue() {
        boolean actualOutput = userRegistration.lastNameValidation("Pabbisetty");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenLastNameExpectedAsFalse() {
        boolean actualOutput = userRegistration.lastNameValidation("pabbisetty");
        assertEquals(false, actualOutput);
    }

    @Test
    public void givenUserEmailExpectedAsTrue() {
        boolean actualoutput = userRegistration.userEmailValidation("m4anoj51@gmail.com");
        assertEquals(true, actualoutput);
    }

    @Test
    public void givenUserEmailExpectedAsFalse() {
        boolean actualoutput = userRegistration.userEmailValidation("m4anoj51@.gmail.com");
        assertEquals(false, actualoutput);
    }

    @Test
    public void givenMobileNumberExpectedAsTrue() {
        boolean actualOutput = userRegistration.userMobileNumberValidation("+91 8331880950");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenMobileNumberExpectedAsFalse() {
        boolean actualOutput = userRegistration.userMobileNumberValidation("+918331880950");
        assertEquals(false, actualOutput);
    }

    @Test
    public void givenPasswordExpectedAsTrue() {
        boolean actualOutput = userRegistration.userPasswordValidation("Manoj@451");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenPasswordExpectedAsFalse() {
        boolean actualOutput = userRegistration.userPasswordValidation("manoj451");
        assertEquals(false, actualOutput);
    }
}