package com.training.uservalidation;

import java.util.regex.Pattern;

public class UserEmailValidation {

    public void validateEmail(String userEmailId) {
        if (validateEmailIdPattern(userEmailId)) {
            System.out.println("Given email id is valid " + userEmailId);
        } else {
            System.out.println("Please provide a valid email eg abc.xyz@bl.co.in. The given email id is invalid " + userEmailId);
        }
    }

    private boolean validateEmailIdPattern(String emailId) {
        {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

            Pattern pat = Pattern.compile(emailRegex);
            boolean isEmailValid = true;
            if (emailId == null)
                isEmailValid = false;
            else {
                isEmailValid = pat.matcher(emailId).matches();
            }
            return isEmailValid;
        }
    }
}
