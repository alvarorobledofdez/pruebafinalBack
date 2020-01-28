
package com.example.controller;

import com.example.model.Cliente;
import com.example.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping
public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        return service.listadoClientes();
    }

    @PostMapping("/clientes")
    public Cliente agregar(@RequestBody Cliente c) {
        return service.altaCliente(c);
    }

    @GetMapping({"/clientes/{id}"})
    public Cliente listarId(@PathVariable("id") int id) {
        return service.clienteUnico(id);
    }

    @PutMapping(path = {"/clientes/{id}"})
    public Cliente editar(@RequestBody Cliente c, @PathVariable("id") int id) {
        c.setId(id);
        return service.editarCliente(c);
    }

    @DeleteMapping(path = {"/clientes/{id}"})
    public Cliente delete(@PathVariable("id") int id) {
        return service.eliminarCliente(id);
    }
}
