
package com.example.service;

import com.example.dao.ClienteRepository;
import com.example.model.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClienteService{
    
    @Autowired
    private ClienteRepository repositorio;
    
    @Override
    public List<Cliente> listadoClientes() {
        return repositorio.findAll();
    }

    @Override
    public Cliente clienteUnico(int id) {
        return repositorio.findById(id);
    }
    
    @Override
    public Cliente clienteDni(String dni){
        return repositorio.findById(dni);
    }

    @Override
    public Cliente altaCliente(Cliente c) {
        return repositorio.save(c);
    }

    @Override
    public Cliente editarCliente(Cliente c) {
        return repositorio.save(c);
    }

    @Override
    public Cliente eliminarCliente(int id) {
        Cliente c = repositorio.findById(id);
        if (c!=null)
        {
           repositorio.delete(c);
        }
        return c; 
    }
}
