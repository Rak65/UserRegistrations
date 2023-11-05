package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void testUserRegistration(){
        String name = "Welcome to User Registration Form";
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals(name,userRegistration.checkUserRegistration("UserRegistration"));
    }
}
