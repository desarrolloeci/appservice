/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuela.appservice.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Date;

/**
 *
 * @author desarrollador3
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonaActivoDTO {
    
    @JsonProperty("id")
    private int id;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("sexo")
    private String sexo;
    @JsonProperty("email")
    private String email;
    @JsonProperty("tipo_documento")
    private String tipo_documento;
    @JsonProperty("nro_documento")
    private String nro_documento;
    @JsonProperty("emplid")
    private String emplid;
    @JsonProperty("tipo_rol")
    private String tipo_rol;
    @JsonProperty("estado")
    private String estado; 
    @JsonProperty("fecha_nacimiento")
    private Date fecha_nacimiento;
    @JsonProperty("cod_area")
    private String cod_area;
    @JsonProperty("area")
    private String area;
    @JsonProperty("ciclo")
    private String ciclo; 
    @JsonProperty("grado")
    private String grado;
    @JsonProperty("ciclo_descr")
    private String ciclo_descr;

    public PersonaActivoDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        this.nro_documento = nro_documento;
    }

    public String getEmplid() {
        return emplid;
    }

    public void setEmplid(String emplid) {
        this.emplid = emplid;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCod_area() {
        return cod_area;
    }

    public void setCod_area(String cod_area) {
        this.cod_area = cod_area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getCiclo_descr() {
        return ciclo_descr;
    }

    public void setCiclo_descr(String ciclo_descr) {
        this.ciclo_descr = ciclo_descr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
