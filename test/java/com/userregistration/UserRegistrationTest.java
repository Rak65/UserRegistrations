package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void testValidFirstName(){
        UserRegistration userRegistration= new UserRegistration();
        Assertions.assertTrue(userRegistration.validateFirstName("Rakesh"));
        Assertions.assertTrue(userRegistration.validateFirstName("Sumesh"));
    }
    @Test
    public void testInvalidFirstName(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validateFirstName("R"));
        Assertions.assertFalse(userRegistration.validateFirstName("Ra"));
        Assertions.assertFalse(userRegistration.validateFirstName("rakesh"));
        Assertions.assertFalse(userRegistration.validateFirstName("1234"));
    }
    @Test
    public void testValidLastName(){
        UserRegistration userRegistration= new UserRegistration();
        Assertions.assertTrue(userRegistration.validateLastName("Rakesh"));
        Assertions.assertTrue(userRegistration.validateLastName("Sumesh"));
    }
    @Test
    public void testInvalidLastName(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validateLastName("R"));
        Assertions.assertFalse(userRegistration.validateLastName("Ra"));
        Assertions.assertFalse(userRegistration.validateLastName("rakesh"));
        Assertions.assertFalse(userRegistration.validateLastName("1234"));
    }
    @Test
    public void testValidEmail(){
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertTrue(userRegistration.validateEmail("abc@yahoo.com"));
        Assertions.assertTrue(userRegistration.validateEmail("abc-100@yahoo.com"));
        Assertions.assertTrue(userRegistration.validateEmail("abc.100@yahoo.com"));
        Assertions.assertTrue(userRegistration.validateEmail("abc111@abc.com"));
        Assertions.assertTrue(userRegistration.validateEmail("abc-100@abc.net"));
        Assertions.assertTrue(userRegistration.validateEmail("abc.100@abc.com.au"));
        Assertions.assertTrue(userRegistration.validateEmail("abc@1.com"));
        Assertions.assertTrue(userRegistration.validateEmail("abc.100@gmail.com.com"));
        Assertions.assertTrue(userRegistration.validateEmail("abc+100@gmail.com"));
    }
    @Test
    public void testInValidEmail() {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertFalse(userRegistration.validateEmail("abc@bl"));
        Assertions.assertFalse(userRegistration.validateEmail("abc.xyz@bl@co.in"));
        Assertions.assertFalse(userRegistration.validateEmail("abc"));
        Assertions.assertFalse(userRegistration.validateEmail("abc.gmail.com"));
        Assertions.assertFalse(userRegistration.validateEmail("abc.gmail.com.1a"));
        Assertions.assertFalse(userRegistration.validateEmail("abc.gmail.com.aa.au"));
    }
}
