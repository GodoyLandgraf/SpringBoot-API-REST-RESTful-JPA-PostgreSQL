package com.spring.rest.api.SpringRestAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.spring.rest.api.SpringRestAPI.model.Usuario;

@Repository
public interface UsuarioRepository extends  CrudRepository<Usuario, Long>{

	
}
