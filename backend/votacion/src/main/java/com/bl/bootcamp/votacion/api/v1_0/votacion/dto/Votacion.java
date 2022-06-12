package com.bl.bootcamp.votacion.api.v1_0.votacion.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Votacion {
    @NotNull(message = "El identificador no debe estar vacío")
    private Integer idVotacion;
    private Integer votacion;
    private Integer idVideojuego;

}
