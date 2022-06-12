package com.bl.bootcamp.votacion.persistencia.modelo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class VotacionBean {

    private Integer idVotacion;

    private Integer voto;

    private Integer idVideojuego;


    private List<VotacionBean> ordVotacion;

    public VotacionBean() {
        ordVotacion = new ArrayList<>();
    }
}