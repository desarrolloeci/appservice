package com.escuela.appservice.rest.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.List;




@JsonPropertyOrder({ "pagination" })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APPPaginationResponse {

    
        
	@JsonProperty("pagination")
	private PaginationResponse pagination;

    public APPPaginationResponse() {
    }

    public PaginationResponse getPagination() {
        return pagination;
    }

    public void setPagination(PaginationResponse pagination) {
        this.pagination = pagination;
    }

    


    
 
        
        
}
