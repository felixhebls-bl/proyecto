package com.bl.bootcamp.comentario;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bl"})
@MapperScan("com.bl.bootcamp.comentario.persistencia.mapper")
@OpenAPIDefinition(info = @Info(title = "comentario-svc", version = "${springdoc.version}", description = ""))
public class ComentarioApplication{

	public static void main(String[] args) {
		SpringApplication.run(ComentarioApplication.class, args);
	}

}
