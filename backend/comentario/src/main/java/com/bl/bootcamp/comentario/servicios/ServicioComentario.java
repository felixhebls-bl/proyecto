package com.bl.bootcamp.comentario.servicios;

import java.util.List;

import com.bl.bootcamp.comentario.api.v1_0.comentario.dto.Comentario;

public interface ServicioComentario {
    List<Comentario> listarComentarios();

    Comentario obtenerComentario(int idComentario);

    int crearComentario(Comentario comentario);

    int editarComentario(Comentario comentario);

    int borrarComentario(int idComentario);

}
