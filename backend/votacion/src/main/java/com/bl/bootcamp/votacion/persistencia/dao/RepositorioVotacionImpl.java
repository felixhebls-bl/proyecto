package com.bl.bootcamp.votacion.persistencia.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bl.bootcamp.votacion.RepositorioVotacion;
import com.bl.bootcamp.votacion.persistencia.mapper.VotacionMapper;
import com.bl.bootcamp.votacion.persistencia.modelo.VotacionBean;

@Repository
public class RepositorioVotacionImpl implements RepositorioVotacion{

    @Autowired
    private VotacionMapper mapper;

    @Override
    public List<VotacionBean> listarVotaciones() {
        return null;
    }

    @Override
    public VotacionBean obtenerVotacion(int votacion) {
        return this.mapper.selectByPrimaryKey(votacion);
    }

    @Override
    public int crearVotacion(VotacionBean votacion) {
        return this.mapper.insert(votacion);
    }

    @Override
    public int editarVotacion(VotacionBean votacion) {
        return this.mapper.updateByPrimaryKeySelective(votacion);
    }

    @Override
    public int borrarVotacion(int votacion) {
        return this.mapper.deleteByPrimaryKey(votacion);
    }
    
}
