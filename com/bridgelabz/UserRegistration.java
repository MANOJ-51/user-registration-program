package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    //validating first name of user using regex
    public static boolean firstNameValidation(String firstName) throws UserRegistrationException {
        String firstNameRegex = "[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);

        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException(UserRegistrationException.typeOfException.INVALID_FIRST_NAME + " PLease Enter a valid First Name");
        }
    }

    //validation of last name
    public static boolean lastNameValidation(String lastName) throws UserRegistrationException {
        String lastNameRegex = "[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);

        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException(UserRegistrationException.typeOfException.INVALID_LAST_NAME + " Please Enter a valid Last Name");
        }
    }

    //user email validation
    public static boolean userEmailValidation(String userEmail) throws UserRegistrationException {
        String userEmailRegex = "^[\\w+-]+(\\.[\\w+-]+)*@[\\w]+(\\.[\\w]+)?(?=(\\.[A-Za-z_]{2,3}$|\\.[a-zA-Z]{2,3}$)).*$";
        Pattern pattern = Pattern.compile(userEmailRegex);
        Matcher matcher = pattern.matcher(userEmail);

        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException(UserRegistrationException.typeOfException.INVALID_USER_EMAIL + " Please Enter a valid Email");
        }
    }

    //user mobile number validation
    public static boolean userMobileNumberValidation(String mobileNumber) throws UserRegistrationException {
        String mobileNumberRegex = "^[+][\\d]{2}[\\s][\\d]{10}$";
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);

        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException(UserRegistrationException.typeOfException.INVALID_MOBILE_NUMBER + " Please Enter a valid Mobile Number");
        }
    }

    //user password validation
    public static boolean userPasswordValidation(String userPassword) throws UserRegistrationException {
        String userPasswordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[\\W])(?=.*[a-z]).{8,}$";
        Pattern pattern = Pattern.compile(userPasswordRegex);
        Matcher matcher = pattern.matcher(userPassword);

        if (matcher.matches()) {
            return true;
        } else {
            throw new UserRegistrationException(UserRegistrationException.typeOfException.INVALID_USER_PASSWORD + " Please Enter a valid Password");
        }
    }
}
