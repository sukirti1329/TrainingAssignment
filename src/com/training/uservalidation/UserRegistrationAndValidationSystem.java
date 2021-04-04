package com.training.uservalidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class UserRegistrationAndValidationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter your full name");
        String userFullName = sc.next();
        UserNameValidation userNameValidation  = new UserNameValidation();
        userNameValidation.validateUserName(userNameSplitter(userFullName));
    }

    private static List<String> userNameSplitter(String userName){

        List<String> userFullName = new ArrayList<String>();
        int firstSpace = userName.indexOf(" "); // detect the first space character
        userFullName.add(userName.substring(0, firstSpace));
        userFullName.add(userName.substring(firstSpace).trim());
        return userFullName;
    }

}
