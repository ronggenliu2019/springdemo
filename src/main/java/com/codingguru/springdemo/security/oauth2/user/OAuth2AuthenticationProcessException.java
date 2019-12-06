package com.codingguru.springdemo.security.oauth2.user;

import org.springframework.security.core.AuthenticationException;

public class OAuth2AuthenticationProcessException extends AuthenticationException {
    public OAuth2AuthenticationProcessException(String msg) {
        super(msg);
    }

    public OAuth2AuthenticationProcessException(String msg, Throwable t) {
        super(msg, t);
    }
}
