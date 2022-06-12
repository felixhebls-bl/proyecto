package com.bl.bootcamp.videojuego.persistencia.mapper;

import java.util.List;

import com.bl.bootcamp.videojuego.persistencia.modelo.VideojuegoBean;

public interface VideojuegoMapper {
    int deleteByPrimaryKey(int idVideojuegoBean);

    int insert(VideojuegoBean record);

    int insertSelective(VideojuegoBean record);

    VideojuegoBean selectByPrimaryKey(int idVideojuegoBean);

    int updateByPrimaryKeySelective(VideojuegoBean record);

    int updateByPrimaryKeyWithBLOBs(VideojuegoBean record);

    int updateByPrimaryKey(VideojuegoBean record);

    List<VideojuegoBean> listarVideojuegos(VideojuegoBean videojuegoBean);
}