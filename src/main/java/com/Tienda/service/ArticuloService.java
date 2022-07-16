package com.Tienda.service;

import com.Tienda.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    
    public List<Articulo> getArticulos(boolean activo);
    
    public Articulo getArticulo(Articulo articulo);
    
    //insertar y modificar
    
    public void save(Articulo articulo);
    
    //eliminar
    public void delete(Articulo articulo);
    
}