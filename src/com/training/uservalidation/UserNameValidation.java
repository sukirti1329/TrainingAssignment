package com.training.uservalidation;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

public class UserNameValidation {

    public  void validateUserName(List<String> userFullName){
        AtomicBoolean validate = new AtomicBoolean(true);
        userFullName.forEach(name ->
        {
           validate.set(validateNameLength(name) && validateNameCaps(name));
        });
        if(validate.get()){
            System.out.println("Valid user name  " +userFullName.get(0)+ " " +userFullName.get(1));
        }else{
            System.out.println("Sorry invalid user name  " +userFullName.get(0)+ " " +userFullName.get(1));
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
