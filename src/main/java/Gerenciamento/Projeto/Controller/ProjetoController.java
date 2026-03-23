package Gerenciamento.Projeto.Controller;

import Gerenciamento.Projeto.Models.ProjetoModel;
import Gerenciamento.Projeto.Service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public List<ProjetoModel> listar(){
        return projetoService.Listar();
    }

    @GetMapping("/{id}")
    public ProjetoModel buscar(@PathVariable long id){
        return projetoService.buscar(id);
    }

    @PostMapping
    public ProjetoModel criar(@RequestBody ProjetoModel projetoModel){
        return projetoService.criar(projetoModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable long id){
        projetoService.deletar(id);
        return ResponseEntity.noContent().build();
    }



}
