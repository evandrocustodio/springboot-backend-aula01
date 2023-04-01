package br.com.evandrocustodio.aula01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.evandrocustodio.aula01.models.Aluno;
import br.com.evandrocustodio.aula01.services.ServiceAlunos;

@Controller
@RequestMapping(path = "/alunos")	
@CrossOrigin(origins = "*")
public class ControlAlunos {

	@Autowired
	ServiceAlunos alunos;

	@GetMapping
	public ResponseEntity<List<Aluno>> listaAlunos() {
		return new ResponseEntity<List<Aluno>>(this.alunos.getAlunos(), HttpStatus.OK);
	}
}
