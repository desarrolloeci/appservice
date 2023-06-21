package com.escuela.appservice.rest.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.escuela.appservice.model.dto.ApiErrorDTO;


@JsonPropertyOrder({ "data", "errors" })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APPResponse <T extends Object>{

    @JsonProperty("data")
    private T data;

    @JsonProperty("errors")
    private List<ApiErrorDTO> errors;

    public APPResponse(Object data) {
            this.data = (T) data;
    }

    public APPResponse(Object data, List<ApiErrorDTO> errors) {
        this.data = (T) data;
        this.errors = errors;
    }

    public APPResponse() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = (T) data;
    }

    public List<ApiErrorDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<ApiErrorDTO> errors) {
        this.errors = errors;
    }

    
}
