/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import com.Tienda.service.ClienteService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa Arquitectura MVC");

//        String mensaje = "Estamos en la semana 4";
//        model.addAttribute("texto", mensaje);
//
//        Cliente cliente = new Cliente("Joel", "Mora", "j1@gmail.com", "387-324");
//        model.addAttribute("cliente", cliente);
//        
//        Cliente cliente2 = new Cliente("kaka", "Mora", "j1@gmail.com", "387-324");
//        Cliente cliente3 = new Cliente("pepe", "Mora", "j1@gmail.com", "387-324");
//        var clientes = Arrays.asList(cliente, cliente2,cliente3);
//        //var clientes = Arrays.asList();
        var clientes = clienteService.getClientes();

        model.addAttribute("clientes", clientes);

        return "index";
    }

    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente) {

        return "modificarCliente";
    }

    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/";
    }

    @GetMapping("/modificarCliente/{idCliente}")
    public String modificarCliente(Cliente cliente, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modificarCliente";
    }

    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(Cliente cliente) {
        clienteService.delete(cliente);
        return "redirect:/";
    }

}
