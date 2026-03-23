package Gerenciamento.Projeto.Models;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity(name = "projeto")
@Table(name = "tb_projeto")

public class ProjetoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "c_nome")
    private String nome;

    @Column(name = "c_data de inicio")
    private LocalDate dataInicio;

    @Column(name = "c_data final")
    private Local datafim;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Local getDatafim() {
        return datafim;
    }

    public void setDatafim(Local datafim) {
        this.datafim = datafim;
    }
}
