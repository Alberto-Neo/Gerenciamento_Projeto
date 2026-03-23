package Gerenciamento.Projeto.Service;

import Gerenciamento.Projeto.Models.ProjetoModel;
import Gerenciamento.Projeto.Repository.Projetorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    private Projetorepository projetorepository;

    public ProjetoService(Projetorepository projetorepository) {
        this.projetorepository = projetorepository;
    }

    public List<ProjetoModel> Listar() {
        return projetorepository.findAll();
    }

    public ProjetoModel salvar(ProjetoModel livroModel){
        return projetorepository.save(livroModel);
    }

    public void deletar(Long id){
        projetorepository.deleteById(id);
    }

    public ProjetoModel buscar(Long id){
        return projetorepository.findById(id).get();
    }

}
