package br.com.docket.teste.repository;

import br.com.docket.teste.domain.Cartorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartorioRepository extends JpaRepository<Cartorio, Integer> {
}
