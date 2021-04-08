package com.training.uservalidation;

import java.util.regex.Pattern;

public class UserPhoneValidation {
    public void validatePhoneNo(String phoneNo) {
        if (validatePhoneNoPattern(phoneNo)) {
            System.out.println("Given phone number is valid " + phoneNo);
        } else {
            System.out.println("Please provide a valid phone number eg 91 720456934. The given phone number is invalid " + phoneNo);
        }
    }

    private boolean validatePhoneNoPattern(String phoneNo) {
        {
            String phoneNoRegex = "\\d{2}\\s\\d{10}";
            boolean isPhoneNoVaid = true;
            if (phoneNo == null)
                isPhoneNoVaid = false;
            else {
                isPhoneNoVaid = phoneNo.matches(phoneNoRegex);
            }
            return isPhoneNoVaid;
        }
    }
}
