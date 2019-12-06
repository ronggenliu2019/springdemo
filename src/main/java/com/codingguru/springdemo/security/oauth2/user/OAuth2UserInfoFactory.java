package com.codingguru.springdemo.security.oauth2.user;

import com.codingguru.springdemo.model.AuthProvider;

import java.util.Map;

public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if(registrationId.equalsIgnoreCase(AuthProvider.github.toString())) {
            return new GithubOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}
