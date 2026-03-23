package Gerenciamento.Projeto.Repository;

import Gerenciamento.Projeto.Models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {
}
