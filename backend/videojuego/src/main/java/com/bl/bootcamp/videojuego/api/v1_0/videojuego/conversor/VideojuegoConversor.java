package com.bl.bootcamp.videojuego.api.v1_0.videojuego.conversor;

import com.bl.bootcamp.videojuego.api.v1_0.videojuego.dto.Videojuego;
import com.bl.bootcamp.videojuego.persistencia.modelo.VideojuegoBean;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class VideojuegoConversor {

    public VideojuegoBean aModelo(Videojuego dto) {
        return aModelo(dto,true);
    }

    public VideojuegoBean aModelo(Videojuego dto, Boolean activo){

        return new VideojuegoBean(dto.getIdVideojuego(), dto.getNombre(), dto.getDescripcion(), dto.getPlataforma(),null);
    }

   public Videojuego aDto(VideojuegoBean dto){
    Videojuego videojuego = new Videojuego();
    videojuego.setIdVideojuego(dto.getIdVideojuego());
    videojuego.setNombre(dto.getNombre());
    videojuego.setDescripcion(dto.getDescripcion());
    videojuego.setPlataforma(dto.getPlataforma());
    return videojuego;
   }
}
