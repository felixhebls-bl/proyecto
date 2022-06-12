package com.bl.bootcamp.videojuego.api.v1_0.videojuego.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Videojuego {
    
    @NotNull(message = "El identificador no debe estar vacío")
    private int idVideojuego;
    private String nombre;
    private String descripcion;
    private String plataforma;

    public Videojuego (){
        
    }
}
