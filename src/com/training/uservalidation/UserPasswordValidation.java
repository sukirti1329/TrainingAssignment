package com.training.uservalidation;

public class UserPasswordValidation {

    public void validateUserPassword(String userPassword) {
        if (validateUserPasswordPattern(userPassword)) {
            System.out.println("Given userPassword is valid ");
        } else {
            System.out.println("Please provide a valid password, the password should contain atleast 8 letters with atleast 1 numeric and 1 special character. The given userPassword is invalid ");
        }
    }

    private boolean validateUserPasswordPattern(String userPassword) {
        {
            String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.+[@#$%^&+=])(?=\\S+$).{8,}$";
            boolean isPasswordValid = true;
            if (userPassword == null)
                isPasswordValid = false;
            else {
                isPasswordValid = userPassword.matches(passwordRegex);
            }
            return isPasswordValid;
        }
    }
}
