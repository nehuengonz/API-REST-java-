package com.example.trabajopractico1.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "productos")
public class Producto implements Serializable{

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    
    private String nombre;
    private int Stock;
    private float precio;
    
    public Producto() {
    }

    public Producto(Long i, String nombre, int stock, float precio) {
        this.id = i;
        this.nombre = nombre;
        Stock = stock;
        this.precio = precio;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getStock() {
        return Stock;
    }
    public void setStock(int stock) {
        Stock = stock;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Producto orElse(Object object) {
        return null;
    }
    

}
