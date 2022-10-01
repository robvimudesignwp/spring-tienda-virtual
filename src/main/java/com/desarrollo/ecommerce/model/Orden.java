
package com.desarrollo.ecommerce.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author rober
 */

@Entity
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private Date fechacreacion;
    private Date fecharecibida;
    private Double total;
    
    @ManyToOne
    private Usuario usuario;
    
    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;

    public Orden() {
    }

    public Orden(Integer id, String numero, Date fechacreacion, Date fecharecibida, Double total, Usuario usuario, DetalleOrden detalle) {
        this.id = id;
        this.numero = numero;
        this.fechacreacion = fechacreacion;
        this.fecharecibida = fecharecibida;
        this.total = total;
        this.usuario = usuario;
        this.detalle = detalle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFecharecibida() {
        return fecharecibida;
    }

    public void setFecharecibida(Date fecharecibida) {
        this.fecharecibida = fecharecibida;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public DetalleOrden getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleOrden detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Orden{" + "id=" + id + ", numero=" + numero + ", fechacreacion=" + fechacreacion + ", fecharecibida=" + fecharecibida + ", total=" + total + ", usuario=" + usuario + ", detalle=" + detalle + '}';
    }

    
    
   
     
    
}
