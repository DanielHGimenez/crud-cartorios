package br.com.docket.teste.controllers;

import br.com.docket.teste.domain.Cartorio;
import br.com.docket.teste.service.CartorioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cartorios")
@Slf4j
public class CartorioController {

    @Autowired
    private CartorioService service;

    @GetMapping
    public String consultar(Model model) {
        List<Cartorio> todosCartorios = service.consultar();
        model.addAttribute("cartorios", todosCartorios);
        return "consultar";
    }

    @PostMapping
    public String cadastrar(String nome, Model model) {
        if (nome != null) {
            service.criar(nome);
        }
        return "cadastrar";
    }

    @RequestMapping(params = "put")
    public String editar(Integer id,  String nome, Model model) {
        if (nome == null) {
            Cartorio cartorio = service.consultar(id).get();
            model.addAttribute("id", cartorio.getId());
            model.addAttribute("nome", cartorio.getNome());
            return "editar";
        }
        else {
            service.alterar(id, nome);
            return "redirect:consultar";
        }
    }

    @RequestMapping(params = "delete")
    public String remover(Integer id, Model model) {
        service.excluir(id);
        return "redirect:consultar";
    }

}
