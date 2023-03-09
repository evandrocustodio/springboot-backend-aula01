package br.com.evandrocustodio.aula01.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.evandrocustodio.aula01.models.Aluno;

@Repository
public interface RepoAlunos  extends JpaRepository<Aluno, Long>{

}
