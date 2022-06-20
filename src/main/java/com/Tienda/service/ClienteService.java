package com.Tienda.service;

import com.Tienda.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    //insertar y modificar
    
    public void save(Cliente cliente);
    
    //eliminar
    public void delete(Cliente cliente);
    
}
