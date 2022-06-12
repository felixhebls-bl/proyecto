package com.bl.bootcamp.comentario.api.v1_0.comentario;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bl.bootcamp.comentario.api.v1_0.comentario.dto.Comentario;
import com.bl.bootcamp.comentario.servicios.ServicioComentario;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1_0/comentario")
public class ComentarioController {
    private static final Logger logger = LoggerFactory.getLogger(ComentarioController.class);

    private ServicioComentario servicioComentario;

    @Autowired
    public ComentarioController(ServicioComentario servicioVideojuego) {
        this.servicioComentario = servicioVideojuego;
    }

         @GetMapping("/list")
         public @ResponseBody
        List<Comentario> listarVideojuegos() {
        logger.info("listarComentarios");
        return servicioComentario.listarComentarios();
    }

    @GetMapping("/{idComentario}")
    public @ResponseBody Comentario obtenerVideojuego(@PathVariable int idComentario) {
        logger.info("obtenerComentario/" + idComentario);
        return servicioComentario.obtenerComentario(idComentario);
    }

    @PostMapping
    public @ResponseBody int crearVideojuego(@Valid @RequestBody Comentario comentario) {
        logger.info("crearComentario");
        return servicioComentario.crearComentario(comentario);
    }

    @PutMapping("/{id}")
    public @ResponseBody int editarVideojuego(@PathVariable Integer id, @Valid @RequestBody Comentario videojuego) {
        logger.info("editarVideojuego");
        return servicioComentario.editarComentario(videojuego);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody int borrarVideojuego(@PathVariable Integer idComentario) {
        logger.info("borrarVideojuego/" + idComentario);
        return servicioComentario.borrarComentario(idComentario);
    }

}
