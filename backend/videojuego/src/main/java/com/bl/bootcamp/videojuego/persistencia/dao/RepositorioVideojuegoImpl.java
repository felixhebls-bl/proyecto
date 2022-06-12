package com.bl.bootcamp.videojuego.persistencia.dao;

import java.util.List;

import com.bl.bootcamp.videojuego.RepositorioVideojuego;
import com.bl.bootcamp.videojuego.persistencia.mapper.VideojuegoMapper;
import com.bl.bootcamp.videojuego.persistencia.modelo.VideojuegoBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RepositorioVideojuegoImpl implements RepositorioVideojuego{

    @Autowired
    private  VideojuegoMapper mapper;


    @Autowired
    public RepositorioVideojuegoImpl(VideojuegoMapper mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    public VideojuegoBean obtenerVideojuego(int idVideojuego) {
        return this.mapper.selectByPrimaryKey(idVideojuego);
    }

    @Override
    public int crearVideojuego(VideojuegoBean videojuego) {
        return this.mapper.insert(videojuego);
    }

    @Override
    public int editarVideojuego(VideojuegoBean videojuego) {
        return this.mapper.updateByPrimaryKeySelective(videojuego);
    }

    @Override
    public int borrarVideojuego(int idVideojuego) {
        return this.mapper.deleteByPrimaryKey(idVideojuego);
    }

    @Override
    public List<VideojuegoBean> listarVideojuegos() {
         return this.mapper.listarVideojuegos(new VideojuegoBean());
    }  
}
