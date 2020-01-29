
package com.example.service;

import com.example.model.Mascota;
import java.util.List;


public interface MascotaService {
    List<Mascota> listadoMascotas();
    List<Mascota> listadoMascotasTipo(String tipo);
    
    Mascota listadoMascotaUnica(int id);
    Mascota eliminarMascota(int id);
    Mascota altaMascota(Mascota m);
    Mascota modificarMascota(Mascota m);   

}
