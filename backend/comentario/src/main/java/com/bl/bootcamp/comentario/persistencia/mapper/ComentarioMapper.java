package com.bl.bootcamp.comentario.persistencia.mapper;

import java.util.List;

import com.bl.bootcamp.comentario.persistencia.modelo.ComentarioBean;

public interface ComentarioMapper {
    int deleteByPrimaryKey(Integer idComentario);

    int insert(ComentarioBean record);

    int insertSelective(ComentarioBean record);

    ComentarioBean selectByPrimaryKey(Integer idComentario);

    int updateByPrimaryKeySelective(ComentarioBean record);

    int updateByPrimaryKeyWithBLOBs(ComentarioBean record);

    int updateByPrimaryKey(ComentarioBean record);

    List<ComentarioBean> listarVideojuegos(ComentarioBean comentarioBean);

}