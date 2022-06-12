package com.bl.bootcamp.votacion.api.v1_0.votacion;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bl.bootcamp.votacion.api.v1_0.votacion.dto.Votacion;
import com.bl.bootcamp.votacion.servicios.ServicioVotacion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1_0/votacion")
public class VotacionController {
    
    private static final Logger logger = LoggerFactory.getLogger(VotacionController.class);

    private ServicioVotacion servicioVotacion;

    @Autowired
    public VotacionController(ServicioVotacion servicioVotacion) {
        this.servicioVotacion = servicioVotacion ;
    }

    @GetMapping("/list")
    public @ResponseBody List<Votacion> listarVotacion() {
        logger.info("listarVotaciones");
        return servicioVotacion.listarVotaciones();
    }

    @GetMapping("/{idVotacion}")
    public @ResponseBody Votacion obtenerVotacion(@PathVariable int idVotacion) {
        logger.info("obtenerVotacion/" + idVotacion);
        return servicioVotacion.obtenerVotacion(idVotacion);
    }

    @PostMapping
    public @ResponseBody int crearVotacion(@Valid @RequestBody Votacion votacion) {
        logger.info("crearVotacion");
        return servicioVotacion.crearVotacion(votacion);
    }

    @PutMapping("/{id}")
    public @ResponseBody int editarVotacion(@PathVariable Integer id, @Valid @RequestBody Votacion votacion) {
        logger.info("editarVotacion");
        return servicioVotacion.editarVotacion(votacion);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody int borrarVotacion(@PathVariable Integer idVotacion) {
        logger.info("borrarVotacion/" + idVotacion);
        return servicioVotacion.borrarVotacion(idVotacion);
    }

}
