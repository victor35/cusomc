package com.victormarques.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victormarques.cursomc.domain.Categoria;
import com.victormarques.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	public CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		
		return  obj.orElse(null);
	}
}