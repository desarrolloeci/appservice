/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuela.appservice.model.persistence;

import com.escuela.appservice.helper.constants.ConstantsTableNames;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 *
 * @author desarrollador3
 */
@Entity
@Table(name = ConstantsTableNames.PERSONASACTIVAS, schema = ConstantsTableNames.SCHEMA)
public class PersonaActivaEntity implements Serializable {
    
    @NotNull
    @Id
    @Column(name = "id", nullable = false, length = 19)
    private Integer id;
    
    @Null
    @Column(name = "nombre", nullable = true)
    private String nombre;
    
    @Null
    @Column(name = "sexo", nullable = true)
    private String sexo;
    
    @Null
    @Column(name = "email", nullable = true)
    private String email;
    
    @Null
    @Column(name = "tipo_documento", nullable = true)
    private String tipo_documento;
    
    @Null
    @Column(name = "nro_documento", nullable = true)
    private String nro_docuento;
    
    @Null
    @Column(name = "emplid", nullable = true)
    private String epmplid;
    
    @Null
    @Column(name = "tipo_rol", nullable = true)
    private String tipo_rol;
    
    @Null
    @Column(name = "estado", nullable = true)
    private String estado;
    
    @Null
    @Column(name = "fecha_nacimiento", nullable = true)
    private Date fecha_nacimiento;
    
    @Null
    @Column(name = "cod_area", nullable = true)
    private String cod_area;
    
    @Null
    @Column(name = "area", nullable = true)
    private String area;
    
    @Null
    @Column(name = "ciclo", nullable = true)
    private String ciclo;
    
    @Null
    @Column(name = "grado", nullable = true)
    private String grado;
    
    @Null
    @Column(name = "ciclo_descr", nullable = true)
    private String ciclo_descr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNro_docuento() {
        return nro_docuento;
    }

    public void setNro_docuento(String nro_docuento) {
        this.nro_docuento = nro_docuento;
    }

    public String getEpmplid() {
        return epmplid;
    }

    public void setEpmplid(String epmplid) {
        this.epmplid = epmplid;
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

    public PersonaActivaEntity() {
    }
    
    
    
}
