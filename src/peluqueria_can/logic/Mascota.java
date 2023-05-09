/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueria_can.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity // Aquí convertimos en entidad nuestra clase mascota
public class Mascota implements Serializable {
    
    //Siempre el anotation va arriba de lo que quiero mapear
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Le indicamos que generará solo
    private int num_cliente;
    private String nombre;
    private String raza;
    private String alergico;
    private String atencion_especial;
    private String observaciones;
    
    @OneToOne // Indicamos que la relación es uno a uno
    private Dueno unDueno;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre, String alergico, String atencion_especial, String observaciones, Dueno unDueno) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.unDueno = unDueno;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Dueno getUnDueno() {
        return unDueno;
    }

    public void setUnDueno(Dueno unDueno) {
        this.unDueno = unDueno;
    }
    
    
    
}
