package org.typeapi.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Describes an HTTP response returned by an operation.")
public class Response {
    @JsonPropertyDescription("The HTTP status code associated with this response. Wildcard error status codes like 499, 599, or 999 can be used to catch all errors.")
    @JsonProperty("code")
    private Integer code;

    @JsonPropertyDescription("The content type to use when the response body cannot be described by a TypeSchema.")
    @JsonProperty("contentType")
    private String contentType;

    @JsonPropertyDescription("TypeSchema describing the structure of the response payload.")
    @JsonProperty("schema")
    private org.typeschema.model.PropertyType schema;


    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setSchema(org.typeschema.model.PropertyType schema) {
        this.schema = schema;
    }

    public org.typeschema.model.PropertyType getSchema() {
        return this.schema;
    }
}

