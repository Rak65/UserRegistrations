package com.userregistration;

public class UserRegistration {
    public String checkUserRegistration(String message){
        if(message.equals("UserRegistration")) {
            return "Welcome to User Registration Form";
        }
        return message;
    }
}
