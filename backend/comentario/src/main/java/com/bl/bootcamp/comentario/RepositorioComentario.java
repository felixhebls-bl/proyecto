package com.bl.bootcamp.comentario;

import java.util.List;

import com.bl.bootcamp.comentario.persistencia.modelo.ComentarioBean;

public interface RepositorioComentario {
    
    List<ComentarioBean> listarComentarios();

    ComentarioBean obtenerComentario(int idVideojuego);

    int crearComentario(ComentarioBean videojuego);

    int editarComentario(ComentarioBean videojuego);

    int borrarComentario(int id);

}
