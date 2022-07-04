package com.bridgelabz;

public class UserRegistrationException extends Exception {
    public UserRegistrationException(String message) {
        super(message);
    }

    enum typeOfException {
        INVALID_FIRST_NAME,
        INVALID_LAST_NAME,
        INVALID_USER_EMAIL,
        INVALID_MOBILE_NUMBER,
        INVALID_USER_PASSWORD
    }
}
