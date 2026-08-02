package org.typeapi.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("The root specification object of TypeAPI.")
public class TypeAPI extends org.typeschema.model.TypeSchema {
    @JsonPropertyDescription("Optional base URL of the service. If specified, client SDKs do not require users to manually specify a base URL.")
    @JsonProperty("baseUrl")
    private String baseUrl;

    @JsonPropertyDescription("A map of operations provided by the API. Keys should use dot-notation to group operations into logical units (e.g., product.getAll or enterprise.product.execute).")
    @JsonProperty("operations")
    private java.util.Map<String, Operation> operations;

    @JsonPropertyDescription("Describes the default authorization mechanism used across the API.")
    @JsonProperty("security")
    private Security security;


    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public void setOperations(java.util.Map<String, Operation> operations) {
        this.operations = operations;
    }

    public java.util.Map<String, Operation> getOperations() {
        return this.operations;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Security getSecurity() {
        return this.security;
    }
}

