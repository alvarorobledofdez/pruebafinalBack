
package com.example.service;

import com.example.model.Historico;
import java.util.List;


public interface HistoricoService {
    List<Historico>listadoHistoricos();
    Historico historicoUnico(int id);
    Historico altaHistorico(Historico h);
    Historico editarHistorico(Historico h);
    Historico eliminarHisotrico(int id);
}
