package br.com.diferpan.clinica.spring.repository;

import br.com.diferpan.clinica.spring.entities.Autoridade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoridadeRepository extends JpaRepository<Autoridade,Long> {

}
