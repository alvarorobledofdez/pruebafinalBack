
package com.example.service;

import com.example.model.Cliente;
import java.util.List;


public interface ClienteService {
    List<Cliente>listadoClientes();
    
    Cliente clienteUnico(int id);
    Cliente clienteDni(String dni);
    Cliente altaCliente(Cliente c);
    Cliente editarCliente(Cliente c);
    Cliente eliminarCliente(int id);

}
