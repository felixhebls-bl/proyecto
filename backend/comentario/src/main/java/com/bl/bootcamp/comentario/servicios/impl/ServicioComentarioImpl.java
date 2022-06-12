package com.bl.bootcamp.comentario.servicios.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.bootcamp.comentario.RepositorioComentario;
import com.bl.bootcamp.comentario.api.v1_0.comentario.conversor.ComentarioConversor;
import com.bl.bootcamp.comentario.api.v1_0.comentario.dto.Comentario;
import com.bl.bootcamp.comentario.servicios.ServicioComentario;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServicioComentarioImpl implements ServicioComentario {
    private RepositorioComentario repositorio;

    private ComentarioConversor conversor;

    @Autowired
       public ServicioComentarioImpl(RepositorioComentario repositorio, ComentarioConversor conversor) {
        this.repositorio = repositorio;
        this.conversor = conversor;
    }

    @Override
    public List<Comentario> listarComentarios() {
        return this.repositorio.listarComentarios().stream().map(conversor::aDto).collect(Collectors.toList());
    }

    @Override
    public Comentario obtenerComentario(int idComentario) {
        return conversor.aDto(this.repositorio.obtenerComentario(idComentario));
    }

    @Override
    public int crearComentario(Comentario comentario) {
        return this.repositorio.crearComentario(conversor.aModelo(comentario));
    }

    @Override
    public int editarComentario(Comentario comentario) {
        return this.repositorio.editarComentario(conversor.aModelo(comentario));
    }

    @Override
    public int borrarComentario(int idComentario) {
        return this.repositorio.borrarComentario(idComentario);
    }

    

}
