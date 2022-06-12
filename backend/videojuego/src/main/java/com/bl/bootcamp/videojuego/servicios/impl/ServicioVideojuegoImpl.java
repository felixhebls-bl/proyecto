package com.bl.bootcamp.videojuego.servicios.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.bootcamp.videojuego.RepositorioVideojuego;
import com.bl.bootcamp.videojuego.api.v1_0.videojuego.conversor.VideojuegoConversor;
import com.bl.bootcamp.videojuego.api.v1_0.videojuego.dto.Videojuego;
import com.bl.bootcamp.videojuego.servicios.ServicioVideojuego;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServicioVideojuegoImpl implements ServicioVideojuego {
    
    private RepositorioVideojuego repositorio;

    private VideojuegoConversor conversor;


    @Autowired
       public ServicioVideojuegoImpl(RepositorioVideojuego repositorio, VideojuegoConversor conversor) {
        this.repositorio = repositorio;
        this.conversor = conversor;
    }

    @Override
    public List<Videojuego> listarVideojuegos() {

        return this.repositorio.listarVideojuegos().stream().map(conversor::aDto).collect(Collectors.toList());
    }

    @Override
    public Videojuego obtenerVideojuego(int idVideojuego) {
        return conversor.aDto(this.repositorio.obtenerVideojuego(idVideojuego));
    }

 

    @Override
    public int crearVideojuego(Videojuego videojuego) {
        return this.repositorio.crearVideojuego(conversor.aModelo(videojuego));
    }

    @Override
    public int editarVideojuego(Videojuego videojuego) {
        return this.repositorio.editarVideojuego(conversor.aModelo(videojuego));
    }

    @Override
    public int borrarVideojuego(int idVideojuego) {
        return this.repositorio.borrarVideojuego(idVideojuego);
    }
}
