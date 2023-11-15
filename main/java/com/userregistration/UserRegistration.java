package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface ValidationRule{
    boolean test(String input);
}
public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,4}$";

    public ValidationRule isValidFirstName= firstName -> firstName != null && Pattern.compile(FIRST_NAME_PATTERN).matcher(firstName).matches();

    public ValidationRule isValidLastName= lastName -> lastName != null && Pattern.compile(FIRST_NAME_PATTERN).matcher(lastName).matches();

    public ValidationRule isValidEmail = email -> email != null && Pattern.compile(EMAIL_PATTERN).matcher(email).matches();

    public ValidationRule isValidMobileNumber = mobileNumber -> mobileNumber != null && mobileNumber.matches("^91\\s\\d{10}$");
    public ValidationRule isValidPassword = password ->
                    password != null &&
                    password.length() >= 8 &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*\\d.*") &&
                    password.matches(".*[!@#$%^&*()].*") &&
                    !password.matches(".*[!@#$%^&*()].*[!@#$%^&*()].*");
}
