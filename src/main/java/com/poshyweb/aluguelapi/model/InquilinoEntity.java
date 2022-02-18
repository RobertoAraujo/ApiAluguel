package com.poshyweb.aluguelapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "inquilino")
public class InquilinoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nome;
    private String cpf;
    private String conjude;
    private int qtdDependentes;

    public InquilinoEntity() {
    }

    public InquilinoEntity(Long id, String nome, String cpf, String conjude, int qtdDependentes) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.conjude = conjude;
        this.qtdDependentes = qtdDependentes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getConjude() {
        return conjude;
    }

    public void setConjude(String conjude) {
        this.conjude = conjude;
    }

    public int getQtdDependentes() {
        return qtdDependentes;
    }

    public void setQtdDependentes(int qtdDependentes) {
        this.qtdDependentes = qtdDependentes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InquilinoEntity)) return false;
        InquilinoEntity inquilino = (InquilinoEntity) o;
        return getQtdDependentes() == inquilino.getQtdDependentes() && Objects.equals(getNome(), inquilino.getNome()) && Objects.equals(getCpf(), inquilino.getCpf()) && Objects.equals(getConjude(), inquilino.getConjude());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCpf(), getConjude(), getQtdDependentes());
    }

    @Override
    public String toString() {
        return "Inquilino{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", conjude='" + conjude + '\'' +
                ", qtdDependentes=" + qtdDependentes +
                '}';
    }
}
