package com.example.trabajopractico1.productoServicio;

import java.util.ArrayList;
//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trabajopractico1.Repositorio.ProductoRepositorio;
import com.example.trabajopractico1.entity.Producto;

@Service
public class ProductoServicio {
    
    @Autowired
    ProductoRepositorio productoRepositorio;
    
    public ArrayList<Producto> obteneProductos()
    {
        return (ArrayList<Producto>) productoRepositorio.findAll();
    }

    public ArrayList<Producto> obteneProductosCliente()
    {
        return (ArrayList<Producto>) productoRepositorio.findAll();
    }
    

    public Optional<Producto> buscarPorId(Long id) {
       return productoRepositorio.findById(id);
}    

    public Producto guardaproducto(Producto producto)
    {
        return productoRepositorio.save(producto);
    }

    public Producto actualizarProducto(Long id, Producto productoModificado)
    {
        Producto auxprod =  productoRepositorio.findById(id).get();
        auxprod.setNombre((productoModificado.getNombre()));
        auxprod.setPrecio(productoModificado.getPrecio());
        auxprod.setStock(productoModificado.getStock());
        return productoRepositorio.save(auxprod);
    }   


    public boolean eliminarproducto(Long id)
    {
        try{
            productoRepositorio.deleteById(id);
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }

    public Producto findById(Long id) {
        return null;
    }
}
