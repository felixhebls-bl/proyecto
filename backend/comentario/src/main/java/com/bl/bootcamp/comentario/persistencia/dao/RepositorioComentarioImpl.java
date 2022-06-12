package com.bl.bootcamp.comentario.persistencia.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bl.bootcamp.comentario.RepositorioComentario;
import com.bl.bootcamp.comentario.persistencia.mapper.ComentarioMapper;
import com.bl.bootcamp.comentario.persistencia.modelo.ComentarioBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class RepositorioComentarioImpl implements RepositorioComentario {

    @Autowired
    private ComentarioMapper mapper;

    @Autowired
    public RepositorioComentarioImpl(ComentarioMapper mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    public ComentarioBean obtenerComentario(int idComentario) {
        return this.mapper.selectByPrimaryKey(idComentario);
    }

    @Override
    public int crearComentario(ComentarioBean videojuego) {
        return this.mapper.insert(videojuego);
    }

    @Override
    public int editarComentario(ComentarioBean videojuego) {
        return this.mapper.updateByPrimaryKeySelective(videojuego);
    }

    @Override
    public int borrarComentario(int idComentario) {
        return this.mapper.deleteByPrimaryKey(idComentario);
    }
    
    @Override
    public List<ComentarioBean> listarComentarios() {
    
    return this.mapper.listarVideojuegos(new ComentarioBean());
    
    }
}
