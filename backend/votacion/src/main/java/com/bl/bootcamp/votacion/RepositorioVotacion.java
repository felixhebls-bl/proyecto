package com.bl.bootcamp.votacion;

import java.util.List;

import com.bl.bootcamp.votacion.persistencia.modelo.VotacionBean;

public interface RepositorioVotacion {
    
    List<VotacionBean> listarVotaciones();

    VotacionBean obtenerVotacion(int votacion);

    int crearVotacion(VotacionBean votacionBean);

    int editarVotacion(VotacionBean votacionBean);

    int borrarVotacion(int id);
}
