package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,4}$";
    public boolean validateFirstName(String firstName){
        if (firstName != null){
            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        }
        return false;
    }
    public boolean validateLastName(String lastName){
        if (lastName != null){
            Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
            Matcher matcher = pattern.matcher(lastName);
            return matcher.matches();
        }
        return false;
    }
    public boolean validateEmail(String email){
        if(email!=null){
            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }

    public boolean validateMobileNumber(String mobileNumber) {
        if (mobileNumber != null && mobileNumber.matches("^91\\s\\d{10}$")){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean validatePassword(String password){
        return password != null &&
                password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@#$%^&*()].*") &&
                !password.matches(".*[!@#$%^&*()].*[!@#$%^&*()].*");
    }

}
