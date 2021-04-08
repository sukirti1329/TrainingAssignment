package com.training.uservalidation;

public class InvalidUserDetailsCustomException extends Exception{

    private String errorMsg;

    public InvalidUserDetailsCustomException (String errorMsg){
        this.errorMsg = errorMsg;
    }



}
