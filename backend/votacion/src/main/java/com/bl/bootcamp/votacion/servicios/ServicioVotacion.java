package com.bl.bootcamp.votacion.servicios;

import java.util.List;

import com.bl.bootcamp.votacion.api.v1_0.votacion.dto.Votacion;

public interface ServicioVotacion {
    List<Votacion> listarVotaciones();

    Votacion obtenerVotacion(int votacion);

    int crearVotacion(Votacion votacion);

    int editarVotacion(Votacion votacion);

    int borrarVotacion(int votacion);
}
