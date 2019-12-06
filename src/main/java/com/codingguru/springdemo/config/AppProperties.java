package com.codingguru.springdemo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "app")
@Getter
public class AppProperties {
    private final Auth auth = new Auth();
    private final Auth2 auth2 = new Auth2();

    @Getter
    @Setter
    public static class Auth {
        private String tokenSecret;
        private long tokenExpirationMsec;
    }

    @Getter
    public static class Auth2 {
        private List<String> authrizedRedirectUris = new ArrayList<>();

        public Auth2 Auth2(List<String> authrizedRedirectUris) {
            this.authrizedRedirectUris = authrizedRedirectUris;
            return this;
        }
    }
}
