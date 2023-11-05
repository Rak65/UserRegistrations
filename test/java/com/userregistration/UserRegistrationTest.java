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
        Assertions.assertFalse(userRegistration.validateFirstName("123"));
    }
}
