package br.com.docket.teste.service.impl;

import br.com.docket.teste.domain.Cartorio;
import br.com.docket.teste.exception.CartorioNaoAchadoException;
import br.com.docket.teste.repository.CartorioRepository;
import br.com.docket.teste.service.CartorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartorioServiceImpl implements CartorioService {

    @Autowired
    private CartorioRepository repository;

    @Override
    public void criar(String nome) {

        Cartorio cartorio =
                Cartorio.builder()
                .nome(nome)
                .build();

        repository.save(cartorio);

    }

    @Override
    public List<Cartorio> consultar() {
        return repository.findAll();
    }

    @Override
    public Optional<Cartorio> consultar(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void alterar(Integer id, String nome) {
        Optional<Cartorio> optCartorio = repository.findById(id);
        if (!optCartorio.isPresent()) {
            throw new CartorioNaoAchadoException();
        }
        Cartorio cartorio = optCartorio.get();
        cartorio.setNome(nome);
        repository.save(cartorio);
    }

    @Override
    public void excluir(Integer id) {
        if (!repository.existsById(id))
            throw new CartorioNaoAchadoException();
        repository.deleteById(id);
    }

}
