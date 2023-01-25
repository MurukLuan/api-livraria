package com.luan.livraria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luan.livraria.domain.Livro;
import com.luan.livraria.exceptions.ObjectNotFoundException;
import com.luan.livraria.repositories.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository repository;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);

		return obj.orElseThrow(()-> new ObjectNotFoundException("Livro não encontrado com o id: " + id));
	}

}
