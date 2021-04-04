package com.training.uservalidation;

import java.util.function.Predicate;

public class UserNameValidation {


    public  void validateName(String userName){
        if(validateNameLength(userName) && validateNameCaps(userName)){
            System.out.println("Successfully Registered");
        }else{
            System.out.println("Name validation failed");
        }
    }

    private boolean validateNameLength(String userName){
        Predicate<String> userNameLengthValidation = name -> userName.length() >=3;
        return userNameLengthValidation.test(userName);
    }

    private boolean validateNameCaps(String userName){
        Predicate<String> userNameCapValidation = name -> Character.toUpperCase(userName.charAt(0)) == userName.charAt(0);
        return userNameCapValidation.test(userName);
    }
}
