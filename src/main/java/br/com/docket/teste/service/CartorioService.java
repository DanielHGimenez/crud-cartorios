package br.com.docket.teste.service;

import br.com.docket.teste.domain.Cartorio;

import java.util.List;
import java.util.Optional;

public interface CartorioService {

    void criar(String nome);

    List<Cartorio> consultar();

    Optional<Cartorio> consultar(Integer id);

    void alterar(Integer id, String nome);

    void excluir(Integer id);

}
