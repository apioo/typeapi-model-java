package org.typeapi.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Describes an API endpoint operation.")
public class Operation {
    @JsonPropertyDescription("All arguments provided to this operation. Each argument maps to an HTTP request location (e.g., path, query, header, or body).")
    @JsonProperty("arguments")
    private java.util.Map<String, Argument> arguments;

    @JsonPropertyDescription("Indicates whether this operation requires authorization. If set to false, the client will omit authorization headers. Defaults to true.")
    @JsonProperty("authorization")
    private Boolean authorization;

    @JsonPropertyDescription("A short description of this operation. Used in generated code docstrings; plain text without line breaks is recommended.")
    @JsonProperty("description")
    private String description;

    @JsonPropertyDescription("The HTTP method associated with this operation (e.g., GET, POST, PUT, DELETE).")
    @JsonProperty("method")
    private String method;

    @JsonPropertyDescription("The HTTP path associated with this operation. May contain path variables (e.g., /my/path/:year) which map to operation arguments.")
    @JsonProperty("path")
    private String path;

    @JsonPropertyDescription("The return type of this operation, which defaults to an HTTP status code of 200.")
    @JsonProperty("return")
    private Response _return;

    @JsonPropertyDescription("An array of OAuth scopes required to access this specific operation.")
    @JsonProperty("security")
    private java.util.List<String> security;

    @JsonPropertyDescription("Indicates the stability level of this operation: 0 (Deprecated), 1 (Experimental), 2 (Stable), or 3 (Legacy). Defaults to 1 (Experimental).")
    @JsonProperty("stability")
    private Integer stability;

    @JsonPropertyDescription("All exceptional states that can occur if the operation fails. Each exception is assigned an HTTP error status code.")
    @JsonProperty("throws")
    private java.util.List<Response> _throws;


    public void setArguments(java.util.Map<String, Argument> arguments) {
        this.arguments = arguments;
    }

    public java.util.Map<String, Argument> getArguments() {
        return this.arguments;
    }

    public void setAuthorization(Boolean authorization) {
        this.authorization = authorization;
    }

    public Boolean getAuthorization() {
        return this.authorization;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return this.method;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }

    public void setReturn(Response _return) {
        this._return = _return;
    }

    public Response getReturn() {
        return this._return;
    }

    public void setSecurity(java.util.List<String> security) {
        this.security = security;
    }

    public java.util.List<String> getSecurity() {
        return this.security;
    }

    public void setStability(Integer stability) {
        this.stability = stability;
    }

    public Integer getStability() {
        return this.stability;
    }

    public void setThrows(java.util.List<Response> _throws) {
        this._throws = _throws;
    }

    public java.util.List<Response> getThrows() {
        return this._throws;
    }
}

