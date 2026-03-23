package Gerenciamento.Projeto.Service;

import Gerenciamento.Projeto.Models.ProjetoModel;
import Gerenciamento.Projeto.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public ProjetoService(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public List<ProjetoModel> Listar(){
        return projetoRepository.findAll();
    }

    public ProjetoModel buscar(long id){
        return projetoRepository.findById(id).get();
    }

    public ProjetoModel criar(ProjetoModel projetoModel){
        return projetoRepository.save(projetoModel);
    }

    public void deletar(long id){
        projetoRepository.deleteById(id);
    }

}
