package com.poshyweb.aluguelapi.dto;

import com.poshyweb.aluguelapi.model.InquilinoEntity;

import java.io.Serializable;
import java.util.Objects;

public class InquilinoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String cpf;
    private String conjude;
    private int qtdDependentes;

    public InquilinoDTO() {
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
        if (!(o instanceof InquilinoDTO)) return false;
        InquilinoDTO that = (InquilinoDTO) o;
        return getQtdDependentes() == that.getQtdDependentes() && Objects.equals(getNome(), that.getNome()) && Objects.equals(getCpf(), that.getCpf()) && Objects.equals(getConjude(), that.getConjude());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCpf(), getConjude(), getQtdDependentes());
    }

    @Override
    public String toString() {
        return "InquilinoDTO{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", conjude='" + conjude + '\'' +
                ", qtdDependentes=" + qtdDependentes +
                '}';
    }
}
