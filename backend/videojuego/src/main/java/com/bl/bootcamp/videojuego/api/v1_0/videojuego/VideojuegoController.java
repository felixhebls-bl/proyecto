package com.bl.bootcamp.videojuego.api.v1_0.videojuego;

import com.bl.bootcamp.videojuego.api.v1_0.videojuego.dto.Videojuego;
import com.bl.bootcamp.videojuego.servicios.ServicioVideojuego;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

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

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1_0/videojuego")

public class VideojuegoController {

    private static final Logger logger = LoggerFactory.getLogger(VideojuegoController.class);

    
    private ServicioVideojuego servicioVideojuego;

    @Autowired
    public VideojuegoController(ServicioVideojuego servicioVideojuego) {
        this.servicioVideojuego = servicioVideojuego;
    }

    @GetMapping("/list")

    public @ResponseBody

        List<Videojuego> listarVideojuegos() {

        logger.info("listarVideojuegos");

        return servicioVideojuego.listarVideojuegos();

    }

    @GetMapping("/{idVideojuego}")
    public @ResponseBody Videojuego obtenerVideojuego(@PathVariable int idVideojuego) {
        logger.info("obtenerVideojuego/" + idVideojuego);
        return servicioVideojuego.obtenerVideojuego(idVideojuego);
    }

    @PostMapping
    public @ResponseBody int crearVideojuego(@Valid @RequestBody Videojuego videojuego) {
        logger.info("crearVideojuego");
        return servicioVideojuego.crearVideojuego(videojuego);
    }

    @PutMapping("/{id}")
    public @ResponseBody int editarVideojuego(@PathVariable Integer id, @Valid @RequestBody Videojuego videojuego) {
        logger.info("editarVideojuego");
        return servicioVideojuego.editarVideojuego(videojuego);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody int borrarVideojuego(@PathVariable Integer idVideojuego) {
        logger.info("borrarVideojuego/" + idVideojuego);
        return servicioVideojuego.borrarVideojuego(idVideojuego);
    }


   
}
