/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.desarrollo.ecommerce.model;

/**
 *
 * @author rober
 */
public class ProductoMoneda {
    private String moneda;
    private Double precio;
    private Double precionuevo;
    private Integer webid;

    public ProductoMoneda() {
    }

    public ProductoMoneda(String moneda, Double precio, Double precionuevo, Integer webid) {
        this.moneda = moneda;
        this.precio = precio;
        this.precionuevo = precionuevo;
        this.webid = webid;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecionuevo() {
        return precionuevo;
    }

    public void setPrecionuevo(Double precionuevo) {
        this.precionuevo = precionuevo;
    }

    public Integer getWebid() {
        return webid;
    }

    public void setWebid(Integer webid) {
        this.webid = webid;
    }

    @Override
    public String toString() {
        return "ProductoMoneda{" + "moneda=" + moneda + ", precio=" + precio + ", precionuevo=" + precionuevo + ", webid=" + webid + '}';
    }
    
    
}
