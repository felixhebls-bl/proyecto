package com.bl.bootcamp.comentario.api.v1_0.comentario.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Comentario {
    

    @NotNull(message = "El identificador no debe estar vacío")
    private Integer idComentario;

    private String descipcion;

    private Integer idVideojuego;


    public Comentario(){
        
    }

}