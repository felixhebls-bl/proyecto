package com.bl.bootcamp.videojuego;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bl"})
@MapperScan("com.bl.bootcamp.videojuego.persistencia.mapper")
@OpenAPIDefinition(info = @Info(title = "videojuego-svc", version = "${springdoc.version}", description = ""))
public class VideojuegoApplication{

	public static void main(String[] args) {
		SpringApplication.run(VideojuegoApplication.class, args);
	}

}
