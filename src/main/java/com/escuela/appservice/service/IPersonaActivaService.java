/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuela.appservice.service;

import com.escuela.appservice.exception.ModelException;
import com.escuela.appservice.model.dto.PersonaActivoDTO;
import java.util.List;


/**
 *
 * @author desarrollador3
 */
public interface IPersonaActivaService {
    
    List<PersonaActivoDTO> consultarPorEmail(String email) throws ModelException; 
    List<PersonaActivoDTO> consultarPorRol(String rol) throws ModelException; 
}