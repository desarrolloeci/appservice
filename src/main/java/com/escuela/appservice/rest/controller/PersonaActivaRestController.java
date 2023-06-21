/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuela.appservice.rest.controller;

import com.escuela.appservice.exception.ModelException;
import com.escuela.appservice.exception.ServerException;
import com.escuela.appservice.model.dto.PersonaActivoDTO;
import com.escuela.appservice.service.IPersonaActivaService;
import com.escuela.appservice.service.impl.PersonaActivaService;
import java.util.List;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import org.json.JSONException;

/**
 *
 * @author desarrollador3
 */
@Path("/personas")
public class PersonaActivaRestController {
    
     public static final Logger log = Logger.getLogger("PersonaActivaRestController");

    @Context
    private UriInfo context;

    public PersonaActivaRestController() {
        this.service = new PersonaActivaService();
    }

    private final IPersonaActivaService service;
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("/{email}")
    public List<PersonaActivoDTO> consultarPorEmail(@PathParam("email") String email) throws ModelException {
        try {
            log.info("Starting get Persona por Email");
            return service.consultarPorEmail(email);
        } catch (JSONException error) {
            throw new ServerException(error.getMessage());
        }
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("/rol/{rol}")
    public List<PersonaActivoDTO> consultarPorRol(@PathParam("rol") String rol) throws ModelException {
        try {
            log.info("Starting get Persona por Rol");
            return service.consultarPorRol(rol);
        } catch (JSONException error) {
            throw new ServerException(error.getMessage());
        }
    }
    
}
