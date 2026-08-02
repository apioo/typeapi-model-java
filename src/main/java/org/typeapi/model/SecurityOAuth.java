package org.typeapi.model;

import com.fasterxml.jackson.annotation.*;

public class SecurityOAuth extends Security {
    @JsonPropertyDescription("Optional OAuth2 authorization endpoint URL.")
    @JsonProperty("authorizationUrl")
    private String authorizationUrl;

    @JsonPropertyDescription("Optional OAuth2 scopes required by default.")
    @JsonProperty("scopes")
    private java.util.List<String> scopes;

    @JsonPropertyDescription("The OAuth2 token endpoint URL.")
    @JsonProperty("tokenUrl")
    private String tokenUrl;


    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    public void setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
    }

    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public String getTokenUrl() {
        return this.tokenUrl;
    }
}

