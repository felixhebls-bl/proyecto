package com.bl.bootcamp.votacion.persistencia.mapper;

import java.util.List;

import com.bl.bootcamp.votacion.persistencia.modelo.VotacionBean;

public interface VotacionMapper {
    int deleteByPrimaryKey(int idVotacionBean);

    int insert(VotacionBean record);

    int insertSelective(VotacionBean record);

    VotacionBean selectByPrimaryKey(int idVotacionBean);

    int updateByPrimaryKeySelective(VotacionBean record);

    int updateByPrimaryKeyWithBLOBs(VotacionBean record);

    int updateByPrimaryKey(VotacionBean record);

    List<VotacionBean> listarVideojuegos(VotacionBean votacionBean);

}