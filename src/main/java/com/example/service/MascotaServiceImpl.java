
package com.example.service;

import com.example.model.Mascota;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService{
    
    @Autowired
    private MascotaRepository repositorio;

    @Override
    public List<Mascota> listadoMascotas() {
        return repositorio.findAll();
    }
    
    @Override
    public List<Mascota> listadoMascotasTipo(String tipo){
        return repositorio.findByTipo(tipo);
    }

    @Override
    public Mascota listadoMascotaUnica(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Mascota altaMascota(Mascota m) {
        return repositorio.save(m);
    }

    @Override
    public Mascota modificarMascota(Mascota m) {
        return repositorio.save(m);
    }

    @Override
    public Mascota eliminarMascota(int id) {
        Mascota m = repositorio.findById(id);
        
        if(m != null){
            repositorio.delete(m);
        }
        return m;
    }
}
