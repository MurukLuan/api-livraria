package com.luan.livraria.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luan.livraria.domain.Categoria;
import com.luan.livraria.domain.Livro;
import com.luan.livraria.repositories.CategoriaRepository;
import com.luan.livraria.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository; 

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Tecnologia da informação", "Livros de Informatica");

		Livro l1 = new Livro(null, "codigo limpo", "não sei o nome do autor", "lorem ipsum", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		categoriaRepository.saveAll(Arrays.asList(cat1));
		livroRepository.saveAll(Arrays.asList(l1));
	}

}
