
package com.example.dao;

import com.example.model.Usuario;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface UsuarioRepository extends Repository<Usuario, Integer>{
    List<Usuario>findAll();
    Usuario findById(int id);
    Usuario findByUsername(String username);
    Usuario save(Usuario u);
    void delete(Usuario u);
}
