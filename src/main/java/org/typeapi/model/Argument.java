package org.typeapi.model;

import com.fasterxml.jackson.annotation.*;

/**
 * Describes arguments of the operation
 */
public class Argument {
    private String contentType;
    private String in;
    private String name;
    private org.typeschema.model.PropertyType schema;

    @JsonSetter("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonGetter("contentType")
    public String getContentType() {
        return this.contentType;
    }

    @JsonSetter("in")
    public void setIn(String in) {
        this.in = in;
    }

    @JsonGetter("in")
    public String getIn() {
        return this.in;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("schema")
    public void setSchema(org.typeschema.model.PropertyType schema) {
        this.schema = schema;
    }

    @JsonGetter("schema")
    public org.typeschema.model.PropertyType getSchema() {
        return this.schema;
    }
}

