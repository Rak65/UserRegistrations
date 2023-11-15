package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationTest {
    @Test
    public void testValidFirstName(){
        UserRegistration userRegistration= new UserRegistration();
        Assertions.assertTrue(userRegistration.isValidFirstName.test ("Rakesh"));
        Assertions.assertTrue(userRegistration.isValidFirstName.test("Sumesh"));
    }
    @Test
    public void testInvalidFirstName(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.isValidFirstName.test("R"));
        Assertions.assertFalse(userRegistration.isValidFirstName.test("Ra"));
        Assertions.assertFalse(userRegistration.isValidFirstName.test("rakesh"));
        Assertions.assertFalse(userRegistration.isValidFirstName.test("1234"));
    }
    @Test
    public void testValidLastName(){
        UserRegistration userRegistration= new UserRegistration();
        Assertions.assertTrue(userRegistration.isValidLastName.test("Rakesh"));
        Assertions.assertTrue(userRegistration.isValidLastName.test("Sumesh"));
    }
    @Test
    public void testInvalidLastName(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.isValidLastName.test("R"));
        Assertions.assertFalse(userRegistration.isValidLastName.test("Ra"));
        Assertions.assertFalse(userRegistration.isValidLastName.test("rakesh"));
        Assertions.assertFalse(userRegistration.isValidLastName.test("1234"));
    }
    @Test
    public void testValidEmail(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.isValidEmail.test("abc@yahoo.com"));
        Assertions.assertTrue(userRegistration.isValidEmail.test("abc-100@yahoo.com"));
    }
    @Test
    public void testInValidEmail() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.isValidEmail.test("abc@bl"));
        Assertions.assertFalse(userRegistration.isValidEmail.test("abc.xyz@bl@co.in"));
    }
    @ParameterizedTest
    @CsvSource({
            "91 7988984543, true",
            "91 7988984543, true",
            "91 7968984543, true",
            "94633978, false",
            "91 7988947543, true"
    })
    public void testValidMobileNumber(String mobileNo, boolean expected){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidMobileNumber.test(mobileNo);
        Assertions.assertEquals(expected,result);
    }
    @ParameterizedTest
    @CsvSource({
            "PassDord1!, true",
            "P@ssw1rW, true",
            "NoDigits@, false",
            "NoSpecials123, false"
    })
    public void testValidPassword(String password, boolean expected){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPassword.test(password);
        Assertions.assertEquals(expected,result);
    }
    @ParameterizedTest
    @CsvSource({
            "abc@bl.co, true",
            "abc.xyz@bl.co.in, true",
            "invalid-email, false",
            "missing@tld., false",
            "too@many@ats, false",
            "abc.xyz@bl.co.in, true"
    })
    public void testEmailValidation(String email, boolean expected) {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.isValidEmail.test(email);
        Assertions.assertEquals(expected, isValid);
    }
}
