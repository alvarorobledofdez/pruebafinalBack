
package com.example.dao;

import com.example.model.Historico;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface HistoricoRepository extends Repository<Historico, Integer>{
    List<Historico>findAll();
    Historico findById(int id);
    Historico save(Historico h);
    void delete(Historico h);
}
