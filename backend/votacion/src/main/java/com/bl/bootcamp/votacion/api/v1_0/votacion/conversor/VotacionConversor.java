package com.bl.bootcamp.votacion.api.v1_0.votacion.conversor;

import org.springframework.stereotype.Component;

import com.bl.bootcamp.votacion.api.v1_0.votacion.dto.Votacion;
import com.bl.bootcamp.votacion.persistencia.modelo.VotacionBean;

@Component
public class VotacionConversor {

    public VotacionBean aModelo(Votacion dto) {
        return aModelo(dto);
    }

    public VotacionBean aModelo(VotacionBean dto, Boolean activo){

        return new VotacionBean(dto.getIdVotacion(),dto.getVoto(), dto.getIdVideojuego(),null);
    }

    public Votacion aDto(VotacionBean dto){

        Votacion votacion = new Votacion();
        votacion.setIdVotacion(dto.getIdVotacion());
        votacion.setVotacion(dto.getVoto());
        votacion.setIdVideojuego(dto.getIdVideojuego());
        return votacion;
    }
}
