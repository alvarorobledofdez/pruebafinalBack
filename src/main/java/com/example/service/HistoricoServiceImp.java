package com.example.service;

import com.example.dao.HistoricoRepository;
import com.example.model.Historico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricoServiceImp implements HistoricoService {

    @Autowired
    private HistoricoRepository repositorio;

    @Override
    public List<Historico> listadoHistoricos() {
        return repositorio.findAll();
    }

    @Override
    public Historico historicoUnico(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Historico altaHistorico(Historico h) {
        return repositorio.save(h);
    }

    @Override
    public Historico editarHistorico(Historico h) {
        return repositorio.save(h);
    }

    @Override
    public Historico eliminarHisotrico(int id) {
        Historico h = repositorio.findById(id);
        if (h != null) {
            repositorio.delete(h);
        }
        return h;
    }

}
