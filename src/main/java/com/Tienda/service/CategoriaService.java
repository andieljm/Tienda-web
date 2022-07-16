
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activo);
    
    public Categoria getCategoria(Categoria categoria);
    
    //insertar y modificar
    
    public void save(Categoria categoria);
    
    //eliminar
    public void delete(Categoria categoria);
    
}
