package br.com.etechoracio.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.jpa.entity.Usuario;
import br.com.etechoracio.jpa.interfaces.UsuarioRepository;

@SpringBootApplication
public class Pw2JpaApplication implements CommandLineRunner{

	
	@Autowired
	private UsuarioRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Pw2JpaApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		Usuario us = Usuario.builder().nome("Claudio").senha("123").build();
		repo.save(us);
		
	}

}
