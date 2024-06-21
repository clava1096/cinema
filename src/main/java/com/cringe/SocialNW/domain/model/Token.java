package com.cringe.SocialNW.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class Token {

    private UUID token;
    public Token() {
        this.token = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return String.valueOf(token);
    }

    public String getToken() {
        return token.toString();
    }

    public void setToken(UUID token) {
        this.token = token;
    }
}
