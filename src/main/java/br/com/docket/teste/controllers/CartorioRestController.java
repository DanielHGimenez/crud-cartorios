package br.com.docket.teste.controllers;

import br.com.docket.teste.domain.Cartorio;
import br.com.docket.teste.service.CartorioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cartorios")
@Slf4j
public class CartorioRestController {

    @Autowired
    private CartorioService service;

    @GetMapping
    public List<Cartorio> consultar() {
        return service.consultar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cartorio> consultar(@PathVariable("id") Integer id) {
        Optional<Cartorio> cartorio = service.consultar(id);
        if (!cartorio.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cartorio.get());
    }

    @PostMapping
    public void cadastrar(@RequestBody String nome) {
        service.criar(nome);
    }

    @PutMapping
    public void editar(@RequestBody Cartorio cartorio) {
        service.alterar(cartorio.getId(), cartorio.getNome());
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable("id") Integer id) {
        service.excluir(id);
    }

}
