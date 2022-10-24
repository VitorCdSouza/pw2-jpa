package br.com.etechoracio.jpa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.jpa.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
