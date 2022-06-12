package com.bl.bootcamp.votacion.servicios.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.bootcamp.votacion.RepositorioVotacion;
import com.bl.bootcamp.votacion.api.v1_0.votacion.conversor.VotacionConversor;
import com.bl.bootcamp.votacion.api.v1_0.votacion.dto.Votacion;
import com.bl.bootcamp.votacion.servicios.ServicioVotacion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServicioVotacionImpl implements ServicioVotacion {
    
    private RepositorioVotacion repositorio;
    private VotacionConversor conversor;

    @Autowired
    public ServicioVotacionImpl(RepositorioVotacion repositorio, VotacionConversor conversor){
        super();
        this.repositorio = repositorio;
        this.conversor = conversor;
    }
  
    @Override
    public List<Votacion> listarVotaciones() {
    return this.repositorio.listarVotaciones().stream().map(conversor::aDto).collect(Collectors.toList());
    }

    @Override
    public Votacion obtenerVotacion(int votacion) {
        return conversor.aDto(this.repositorio.obtenerVotacion(votacion));
    }

    @Override
    public int crearVotacion(Votacion votacion) {
        return this.repositorio.crearVotacion(conversor.aModelo(votacion));
    }

    @Override
    public int editarVotacion(Votacion votacion) {
        return this.repositorio.editarVotacion(conversor.aModelo(votacion));
    }

    @Override
    public int borrarVotacion(int votacion) {
        return this.repositorio.borrarVotacion(votacion);
    }

}
