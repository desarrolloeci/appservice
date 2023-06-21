/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuela.appservice.model.mapper;

import com.escuela.appservice.model.dto.PersonaActivoDTO;
import com.escuela.appservice.model.persistence.PersonaActivaEntity;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desarrollador3
 */
public class PersonaActivaMapperImpl implements PersonaActivaMapper{

    @Override
    public PersonaActivoDTO toPersonaActivaDto(PersonaActivaEntity persona) {
        if (persona == null) {
            return null;
        }

        PersonaActivoDTO personaDTO = new PersonaActivoDTO();
        personaDTO.setNombre(persona.getNombre()== null ? "" :persona.getNombre());
        personaDTO.setSexo(persona.getSexo()== null ? "" :persona.getSexo());
        personaDTO.setEmail(persona.getEmail()== null ? "" :persona.getEmail());
        personaDTO.setTipo_documento(persona.getTipo_documento()== null ? "" :persona.getTipo_documento());
        personaDTO.setNro_documento(persona.getNro_docuento()== null ? "" :persona.getNro_docuento());
        personaDTO.setEmplid(persona.getEpmplid()== null ? "" :persona.getEpmplid());
        personaDTO.setTipo_rol(persona.getTipo_rol()== null ? "" :persona.getTipo_rol());
        personaDTO.setEstado(persona.getEstado()== null ? "" :persona.getEstado());
        personaDTO.setCod_area(persona.getCod_area()== null ? "" :persona.getCod_area());
        personaDTO.setArea(persona.getArea()== null ? "" :persona.getArea());
        personaDTO.setCiclo(persona.getCiclo()== null ? "" :persona.getCiclo());
        personaDTO.setGrado(persona.getGrado()== null ? "" :persona.getGrado());
        personaDTO.setCiclo_descr(persona.getCiclo_descr()== null ? "" :persona.getCiclo_descr());
        personaDTO.setFecha_nacimiento((Date) (persona.getFecha_nacimiento()== null ? "" :persona.getFecha_nacimiento()));
        personaDTO.setId(persona.getId()== null ? 0 :persona.getId());
        
        
        
        return personaDTO;
    }

    @Override
    public PersonaActivaEntity toPersonaActivaEntity(PersonaActivoDTO persona) {
        if (persona == null) {
            return null;
        }

        PersonaActivaEntity personaActivaEntity = new PersonaActivaEntity();

        personaActivaEntity.setNombre(persona.getNombre());
        personaActivaEntity.setSexo(persona.getSexo());
        personaActivaEntity.setEmail(persona.getEmail());
        personaActivaEntity.setTipo_documento(persona.getTipo_documento());
        personaActivaEntity.setNro_docuento(persona.getNro_documento());
        personaActivaEntity.setEpmplid(persona.getEmplid());
        personaActivaEntity.setTipo_rol(persona.getTipo_rol());
        personaActivaEntity.setEstado(persona.getEstado());
        personaActivaEntity.setCod_area(persona.getCod_area());
        personaActivaEntity.setArea(persona.getArea());
        personaActivaEntity.setCiclo(persona.getCiclo());
        personaActivaEntity.setGrado(persona.getGrado());
        personaActivaEntity.setCiclo_descr(persona.getCiclo_descr());
        personaActivaEntity.setFecha_nacimiento(persona.getFecha_nacimiento());
        personaActivaEntity.setId(persona.getId());
        
        return personaActivaEntity;
    }

    @Override
    public List<PersonaActivoDTO> map(List<PersonaActivaEntity> personas) {
        if (personas == null) {
            return null;
        }

        List<PersonaActivoDTO> list = new ArrayList<PersonaActivoDTO>(personas.size());
        for (PersonaActivaEntity personaEntity : personas) {
            list.add(toPersonaActivaDto(personaEntity));
        }

        return list;
    }
    
}
