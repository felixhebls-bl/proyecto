package com.bl.bootcamp.videojuego.persistencia.modelo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class VideojuegoBean {

    private int idVideojuego;

    private String nombre;

    private String descripcion;

    private String plataforma;

    protected List<VideojuegoBean> ordVideojuego;
    
    public VideojuegoBean() {
        ordVideojuego = new ArrayList<>();
    }
}