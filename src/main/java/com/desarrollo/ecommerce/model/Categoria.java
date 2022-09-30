/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.desarrollo.ecommerce.model;

/**
 *
 * @author rober
 */
public class Categoria {
    private Integer codigo;
    private String nombre;
    private Boolean visible;
    private Integer categoria_superior;

    public Categoria() {
    }

    public Categoria(Integer codigo, String nombre, Boolean visible, Integer categoria_superior) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.visible = visible;
        this.categoria_superior = categoria_superior;
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

    public Integer getCategoria_superior() {
        return categoria_superior;
    }

    public void setCategoria_superior(Integer categoria_superior) {
        this.categoria_superior = categoria_superior;
    }

    @Override
    public String toString() {
        return "Categoria{" + "codigo=" + codigo + ", nombre=" + nombre + ", visible=" + visible + ", categoria_superior=" + categoria_superior + '}';
    }
    
    
}
