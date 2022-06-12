package com.bl.bootcamp.comentario.api.v1_0.comentario.conversor;

import org.springframework.stereotype.Component;

import com.bl.bootcamp.comentario.api.v1_0.comentario.dto.Comentario;
import com.bl.bootcamp.comentario.persistencia.modelo.ComentarioBean;

@Component
public class ComentarioConversor {

  

    public ComentarioBean aModelo(Comentario dto) {

        return new ComentarioBean(dto.getIdComentario(), dto.getDescipcion(), dto.getIdVideojuego(),null);
    }

    public Comentario aDto(ComentarioBean dto){
        
        Comentario comentario = new Comentario();
        comentario.setIdVideojuego(dto.getIdComentario());
        comentario.setDescipcion(dto.getDescipcion());
        comentario.setIdVideojuego(dto.getIdVideojuego());
        return comentario;


    }
    
}
