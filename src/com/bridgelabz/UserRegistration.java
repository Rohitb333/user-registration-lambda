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

        Validation isValidFirstName = (pattern, firstName) -> {
            return "First Name is " + Pattern.compile(pattern).matcher(firstName).matches();
        };
        System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{2,}$", "Rohit"));
        System.out.println("=======================================================================================");


        Validation isValidLastName = (pattern, lastName) -> {
            return "Last Name is " + Pattern.compile(pattern).matcher(lastName).matches();
        };
        System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Bansod"));
        System.out.println("=======================================================================================");
    }
}

