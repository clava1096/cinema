package com.cringe.SocialNW.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class TicketAlreadyPurchasedException extends RuntimeException {

    public TicketAlreadyPurchasedException(){
        super("The ticket has been already purchased!");
    }

}
