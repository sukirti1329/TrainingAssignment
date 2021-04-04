package com.training.uservalidation;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserRegistrationAndValidationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String firstName = inputFirstName();
        String lastName = inputLastName();
      //  String userName = sc.next();
        UserNameValidation userNameValidation  = new UserNameValidation();
        userNameValidation.validateName(firstName);
        userNameValidation.validateName(lastName);

    }

    private static String inputFirstName(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter your First name");
        return sc.next();

    }

    private static String inputLastName(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter Last name");
        return sc.next();
    }
}
