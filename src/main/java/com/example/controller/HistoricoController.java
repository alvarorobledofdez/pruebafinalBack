
package com.example.controller;

import com.example.model.Historico;
import com.example.service.HistoricoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping
public class HistoricoController {
    
    @Autowired
    HistoricoService service;
    
    @GetMapping("/historicos")
    public List<Historico> listar() {
        return service.listadoHistoricos();
    }

    @PostMapping("/historicos")
    public Historico agregar(@RequestBody Historico h) {
        return service.altaHistorico(h);
    }

    @GetMapping({"/historicos/{id}"})
    public Historico listarId(@PathVariable("id") int id) {
        return service.historicoUnico(id);
    }

    @PutMapping(path = {"/historicos/{id}"})
    public Historico editar(@RequestBody Historico h, @PathVariable("id") int id) {
        h.setId(id);
        return service.editarHistorico(h);
    }

    @DeleteMapping(path = {"/historicos/{id}"})
    public Historico delete(@PathVariable("id") int id) {
        return service.eliminarHisotrico(id);
    }
}
