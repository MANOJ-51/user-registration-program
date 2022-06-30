package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //taking scanner for user input
    static Scanner scanner = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");

        firstNameValidation();   //calling firstnameValidation

        lastNameValidation();    //calling lastnameValidation

        userEmailValidation();   //calling userEmailValidation

        userMobileNumberValidation();  //calling userMobileNumberValidation

        userPasswordValidation();    //calling userPasswordValidation
    }

    //validating first name of user using regex
    public static void firstNameValidation() {
        System.out.println("Enter the First Name starting letter should be capital ");
        String firstName = scanner.nextLine();            //talking input from the user
        String firstNameRegex = "[A-z[a-z]]{3,}";         //regex validation
        Pattern pattern = Pattern.compile(firstNameRegex);  //compiling
        Matcher matcher = pattern.matcher(firstName);       //matching
        System.out.println("First Name pattern matching : " + matcher.matches());    //printing
    }

    //validation of last name
    public static void lastNameValidation() {
        System.out.println("Enter the Last Name first letter should be capital");
        String lastName = scanner.nextLine();
        String lastNameRegex = "[A-z[a-z]]{3,}";
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);
        System.out.println("Last Name pattern matching : " + matcher.matches());
    }

    //user email validation
    public static void userEmailValidation() {
        System.out.println("Enter the Email id ");
        String userEmail = scanner.nextLine();
        String userEmailRegex = "^[\\w]{3,}[\\W[^@_$]]?[\\w]+?[@][\\w]{3,10}[.][\\w]{3,6}[.]?[\\w]{3,10}?$";
        Pattern pattern = Pattern.compile(userEmailRegex);
        Matcher matcher = pattern.matcher(userEmail);
        System.out.println("User Email Id is : " + matcher.matches());
    }

    //user mobile number validation
    public static void userMobileNumberValidation() {
        System.out.println("Enter the Mobile number with country code");
        String mobileNumber = scanner.nextLine();
        String mobileNumberRegex = "^[+][\\d]{2}[\\s][\\d]{10}$";
        Pattern pattern = Pattern.compile(mobileNumberRegex);
        Matcher matcher = pattern.matcher(mobileNumber);
        System.out.println("User Mobile Number is : " + matcher.matches());
    }

    //user password validation
    public static void userPasswordValidation() {
        System.out.println("Enter password Minimum 8 characters ");
        String userPassword = scanner.nextLine();
        String userPasswordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[\\W])(?=.*[a-z]).{8,}$";
        Pattern pattern = Pattern.compile(userPasswordRegex);
        Matcher matcher = pattern.matcher(userPassword);
        System.out.println("User Password is : " + matcher.matches());
    }
}
