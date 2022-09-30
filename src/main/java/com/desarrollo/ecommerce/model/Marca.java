/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.desarrollo.ecommerce.model;

/**
 *
 * @author rober
 */
public class Marca {
    private Integer codigo;
    private String nombre;
    private Boolean visible;

    public Marca() {
    }

    public Marca(Integer codigo, String nombre, Boolean visible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.visible = visible;
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

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Marca{" + "codigo=" + codigo + ", nombre=" + nombre + ", visible=" + visible + '}';
    }
    
    
}
