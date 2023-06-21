/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuela.appservice.service.impl;

import com.escuela.appservice.db.dao.IPersonaActivaDAO;
import com.escuela.appservice.db.dao.impl.PersonaActivoDAOImpl;
import com.escuela.appservice.exception.ModelException;
import com.escuela.appservice.model.dto.PersonaActivoDTO;
import com.escuela.appservice.model.mapper.PersonaActivaMapper;
import com.escuela.appservice.model.mapper.PersonaActivaMapperImpl;
import com.escuela.appservice.model.persistence.PersonaActivaEntity;
import com.escuela.appservice.service.IPersonaActivaService;
import java.util.List;

/**
 *
 * @author desarrollador3
 */
public class PersonaActivaService implements IPersonaActivaService{

    public PersonaActivaService() {
        this.dao = new PersonaActivoDAOImpl();
        this.mapper = new PersonaActivaMapperImpl();
    }

    private final IPersonaActivaDAO dao;

    private final PersonaActivaMapper mapper;
    
    
    @Override
    public List<PersonaActivoDTO> consultarPorEmail(String email) throws ModelException {
        
        try {
            return mapper.map(dao.consultarPorEmail(email));
        } catch (Exception excepcion) {
            throw new ModelException(excepcion.getMessage());
        }
        
    }
    
    @Override
    public List<PersonaActivoDTO> consultarPorRol(String rol) throws ModelException {
        
        try {
            return mapper.map(dao.consultarPorRol(rol));
        } catch (Exception excepcion) {
            throw new ModelException(excepcion.getMessage());
        }
        
    }
    
    
    
}
