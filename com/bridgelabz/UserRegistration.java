package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    //validating first name of user using regex
    public static boolean firstNameValidation(String firstName) {
        String firstNameRegex = "[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    //validation of last name
    public static boolean lastNameValidation(String lastName) {
        String lastNameRegex = "[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    //user email validation
    public static boolean userEmailValidation(String userEmail) {
        String userEmailRegex = "^[\\w]+[\\W[^@_$]]?[\\w]+?[@][\\w]+[.][\\w]+[.]?[\\w]+?$";
        Pattern pattern = Pattern.compile(userEmailRegex);
        Matcher matcher = pattern.matcher(userEmail);
        return matcher.matches();
    }

    //user mobile number validation
    public static boolean userMobileNumberValidation(String mobileNumber) {
        String mobileNumberRegex = "^[+][\\d]{2}[\\s][\\d]{10}$";
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    //user password validation
    public static boolean userPasswordValidation(String userPassword) {
        String userPasswordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[\\W])(?=.*[a-z]).{8,}$";
        Pattern pattern = Pattern.compile(userPasswordRegex);
        Matcher matcher = pattern.matcher(userPassword);
        return matcher.matches();
    }
}
