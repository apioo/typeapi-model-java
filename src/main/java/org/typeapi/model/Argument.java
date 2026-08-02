package org.typeapi.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Describes an argument passed to an operation.")
public class Argument {
    @JsonPropertyDescription("The content type to use when the payload cannot be described by a TypeSchema.")
    @JsonProperty("contentType")
    private String contentType;

    @JsonPropertyDescription("Specifies where the argument value is located: path, query, header, or body. If set to path, the operation path must include a matching path variable.")
    @JsonProperty("in")
    private String in;

    @JsonPropertyDescription("Optional name of the parameter in the path, query, or header. If omitted, the key of the arguments map is used.")
    @JsonProperty("name")
    private String name;

    @JsonPropertyDescription("TypeSchema describing the structure of the argument payload.")
    @JsonProperty("schema")
    private org.typeschema.model.PropertyType schema;


    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return this.contentType;
    }

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

    public void setSchema(org.typeschema.model.PropertyType schema) {
        this.schema = schema;
    }

    public org.typeschema.model.PropertyType getSchema() {
        return this.schema;
    }
}

