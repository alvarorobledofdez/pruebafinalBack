
package com.example.dao;

import com.example.model.Cliente;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface ClienteRepository extends Repository<Cliente, Integer>{
    List<Cliente>findAll();
    Cliente findById(int id);
    Cliente findById(String dni);
    Cliente save(Cliente c);
    void delete(Cliente c);
}
