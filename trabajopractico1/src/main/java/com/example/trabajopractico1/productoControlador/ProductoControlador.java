package com.example.trabajopractico1.productoControlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trabajopractico1.entity.Producto;
import com.example.trabajopractico1.productoServicio.ProductoServicio;

@RestController
@RequestMapping("/")
public class ProductoControlador {
    
    @Autowired
    private ProductoServicio service;

    @GetMapping
    public ArrayList<Producto> obteneProductos(){
        return service.obteneProductos();
    }
    @PostMapping
    public Producto guardaProducto(@RequestBody Producto producto)
    {
        return this.service.guardaproducto(producto);
    }
    //aiadimos un parametro de ruta "id"
    //ej localhost:8080/producto/1
    @GetMapping("/producto/{id}")
    public Optional<Producto> obtenerProductoXId(@PathVariable("id") Long id)
    {
        return this.service.buscarPorId(id);
    }
    @GetMapping("/all")
    public ArrayList<Producto> obtenerProductos()
    {
        return this.service.obteneProductos();
    }
    ///
    ///ruta para el cliente no puede agregar ni eliminar solo ver el precio modificado
    @GetMapping("/clientes/{id}")
    public Optional<Producto> obtenerProducto(@PathVariable("id") Long id)
    {
        //da error si no se agrega el orElse ya que el tipo optional tiene que devolver si o si un valor de tipo producto
        Producto auxprod=service.buscarPorId(id).orElse(null);
        if ( auxprod != null)
            auxprod.setPrecio((float) (auxprod.getPrecio()*1.5));
        
        return Optional.ofNullable(auxprod);
    }
 
    ///
    @PostMapping("/producto/{id}")
    public Producto crearProducto(@RequestBody Producto producto)
    {
        return service.guardaproducto(producto);   
    }

    @PutMapping("/producto/{id}")
    public Producto actuaProducto(@PathVariable("id") Long id,@RequestBody Producto producto)
    {
        return service.actualizarProducto(id, producto);
    }

    @DeleteMapping("/producto/{id}")
    public boolean eliminarproducto(@PathVariable("id") Long id)
    {
        return service.eliminarproducto(id);
    }
    
}
