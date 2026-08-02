package org.typeapi.model;

import com.fasterxml.jackson.annotation.*;

public class SecurityApiKey extends Security {
    @JsonPropertyDescription("The location of the API key. Must be either \"header\" or \"query\".")
    @JsonProperty("in")
    private String in;

    @JsonPropertyDescription("The name of the header or query parameter (e.g., \"X-Api-Key\").")
    @JsonProperty("name")
    private String name;


    public void setIn(String in) {
        this.in = in;
    }

    public String getIn() {
        return this.in;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

