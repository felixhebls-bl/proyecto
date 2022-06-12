package com.bl.bootcamp.videojuego;

import java.util.List;

import com.bl.bootcamp.videojuego.persistencia.modelo.VideojuegoBean;

public interface RepositorioVideojuego {
    
    List<VideojuegoBean> listarVideojuegos();

    VideojuegoBean obtenerVideojuego(int idVideojuego);

    int crearVideojuego(VideojuegoBean videojuego);

    int editarVideojuego(VideojuegoBean videojuego);

    int borrarVideojuego(int id);


}
