package com.bridgelabz;

/*
 *Code to validate User Entry ( First Name, Last Name, Email, Mobile, and Password)
 *using Lambda Function
 */
import java.util.regex.Pattern;

//Functional interface
interface Validation {
    public String validate(String regex, String userDetails);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem using lambda");
        System.out.println("=======================================================================================");


}

