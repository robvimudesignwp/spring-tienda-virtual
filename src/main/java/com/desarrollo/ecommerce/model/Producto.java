/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.desarrollo.ecommerce.model;

/**
 *
 * @author rober
 */
public class Producto {
    private Integer webid;
    private String nombre;
    private Double precio;
    private Double precionuevo;
    private Integer stock;
    private Boolean nuevo;
    private Boolean recomendado;
    private String descripcion;
    private Boolean visible;
    private Integer codigo_marca;
    private Integer codigo_categoria;
    private String imagen;

    public Producto() {
    }

    public Producto(Integer webid, String nombre, Double precio, Double precionuevo, Integer stock, Boolean nuevo, Boolean recomendado, String descripcion, Boolean visible, Integer codigo_marca, Integer codigo_categoria, String imagen) {
        this.webid = webid;
        this.nombre = nombre;
        this.precio = precio;
        this.precionuevo = precionuevo;
        this.stock = stock;
        this.nuevo = nuevo;
        this.recomendado = recomendado;
        this.descripcion = descripcion;
        this.visible = visible;
        this.codigo_marca = codigo_marca;
        this.codigo_categoria = codigo_categoria;
        this.imagen = imagen;
    }

    public Integer getWebid() {
        return webid;
    }

    public void setWebid(Integer webid) {
        this.webid = webid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getNuevo() {
        return nuevo;
    }

    public void setNuevo(Boolean nuevo) {
        this.nuevo = nuevo;
    }

    public Boolean getRecomendado() {
        return recomendado;
    }

    public void setRecomendado(Boolean recomendado) {
        this.recomendado = recomendado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Integer getCodigo_marca() {
        return codigo_marca;
    }

    public void setCodigo_marca(Integer codigo_marca) {
        this.codigo_marca = codigo_marca;
    }

    public Integer getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(Integer codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Producto{" + "webid=" + webid + ", nombre=" + nombre + ", precio=" + precio + ", precionuevo=" + precionuevo + ", stock=" + stock + ", nuevo=" + nuevo + ", recomendado=" + recomendado + ", descripcion=" + descripcion + ", visible=" + visible + ", codigo_marca=" + codigo_marca + ", codigo_categoria=" + codigo_categoria + ", imagen=" + imagen + '}';
    }
    
    
}
