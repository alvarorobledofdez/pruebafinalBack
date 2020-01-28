
package com.example.service;

import com.example.dao.UsuarioRepository;
import com.example.model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    private UsuarioRepository repositorio;
    
    @Override
    public List<Usuario> listadoUsuarios() {
        return repositorio.findAll();
    }

    @Override
    public Usuario listadoUsuarioUnico(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Usuario altaUsuario(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario modificarUsuario(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario eliminarUsuario(int id) {
        Usuario u = repositorio.findById(id);
        
        if(u != null){
            repositorio.delete(u);
        }
        return u;
    }
    
}
