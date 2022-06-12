package com.bl.bootcamp.comentario.persistencia.modelo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ComentarioBean {
    private Integer idComentario;

    private String descipcion;

    private Integer idVideojuego;

    private List<ComentarioBean> ordComentarios;

    public ComentarioBean() {
        ordComentarios = new ArrayList<>();
    }

}