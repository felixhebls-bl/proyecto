package com.bl.bootcamp.videojuego.servicios;

import java.util.List;

import com.bl.bootcamp.videojuego.api.v1_0.videojuego.dto.Videojuego;

public interface ServicioVideojuego {
    
    List<Videojuego> listarVideojuegos();

    Videojuego obtenerVideojuego(int idVideojuego);

    int crearVideojuego(Videojuego videojuego);

    int editarVideojuego(Videojuego videojuego);

    int borrarVideojuego(int idVideojuego);

}
