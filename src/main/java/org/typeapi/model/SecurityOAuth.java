package org.typeapi.model;

import com.fasterxml.jackson.annotation.*;

public class SecurityOAuth extends Security {
    private String authorizationUrl;
    private java.util.List<String> scopes;
    private String tokenUrl;

    @JsonSetter("authorizationUrl")
    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    @JsonGetter("authorizationUrl")
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    @JsonSetter("scopes")
    public void setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
    }

    @JsonGetter("scopes")
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    @JsonSetter("tokenUrl")
    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    @JsonGetter("tokenUrl")
    public String getTokenUrl() {
        return this.tokenUrl;
    }
}

