package com.example.trabajopractico1.Repositorio;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.trabajopractico1.entity.Producto;

@Repository
public interface ProductoRepositorio extends CrudRepository<Producto,Long> {
    public abstract ArrayList<Producto> findByNombre(String nombre);
}
