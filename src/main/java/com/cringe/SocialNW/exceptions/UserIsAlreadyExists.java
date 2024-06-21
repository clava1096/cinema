package com.cringe.SocialNW.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class UserIsAlreadyExists extends RuntimeException{
    public UserIsAlreadyExists(){
        super("User is already exists!");
    }
}
