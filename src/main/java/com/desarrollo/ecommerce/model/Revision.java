/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.desarrollo.ecommerce.model;

import java.util.Date;

/**
 *
 * @author rober
 */
public class Revision {
    private Integer codigo;
    private String nombre;
    private String email;
    private String comentario;
    private Integer puntuacion;
    private Date fecha;
    private Integer webid;

    public Revision() {
    }

    public Revision(Integer codigo, String nombre, String email, String comentario, Integer puntuacion, Date fecha, Integer webid) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.webid = webid;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getWebid() {
        return webid;
    }

    public void setWebid(Integer webid) {
        this.webid = webid;
    }

    @Override
    public String toString() {
        return "Revision{" + "codigo=" + codigo + ", nombre=" + nombre + ", email=" + email + ", comentario=" + comentario + ", puntuacion=" + puntuacion + ", fecha=" + fecha + ", webid=" + webid + '}';
    }
    
    
    
}
