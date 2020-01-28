
package com.example.service;

import com.example.model.Cliente;
import com.example.model.Usuario;
import java.util.List;


public interface UsuarioService {
    List<Usuario>listadoUsuarios();
    Usuario listadoUsuarioUnico(int id);
    Usuario altaUsuario(Usuario u);
    Usuario modificarUsuario(Usuario u);
    Usuario eliminarUsuario(int id);
}
