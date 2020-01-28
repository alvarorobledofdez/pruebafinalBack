
package com.example.dao;

import com.example.model.Mascota;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface MascotaRepository extends Repository<Mascota, Integer>{
    
    List<Mascota>findAll();
    Mascota findById(int id);
    Mascota findById(String tipo);
    Mascota save(Mascota m);
    void delete(Mascota m);
}
