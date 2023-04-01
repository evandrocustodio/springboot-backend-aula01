package br.com.evandrocustodio.aula01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.evandrocustodio.aula01.models.Aluno;
import br.com.evandrocustodio.aula01.repositories.RepoAlunos;

@Service
public class ServiceAlunos {
	
	@Autowired
	RepoAlunos alunos;
	
	public List<Aluno> getAlunos() {
	  	return this.alunos.findAll();
	};

}
