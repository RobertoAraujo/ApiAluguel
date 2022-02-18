package com.poshyweb.aluguelapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "proprietario")
public class Proprietario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String nomeResidencial;
    private double valorAluguel;

    public Proprietario() {
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

    public String getNomeResidencial() {
        return nomeResidencial;
    }

    public void setNomeResidencial(String nomeResidencial) {
        this.nomeResidencial = nomeResidencial;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proprietario)) return false;
        Proprietario that = (Proprietario) o;
        return Double.compare(that.getValorAluguel(), getValorAluguel()) == 0 && Objects.equals(getNome(), that.getNome()) && Objects.equals(getCpf(), that.getCpf()) && Objects.equals(getNomeResidencial(), that.getNomeResidencial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCpf(), getNomeResidencial(), getValorAluguel());
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nomeResidencial='" + nomeResidencial + '\'' +
                ", valorAluguel=" + valorAluguel +
                '}';
    }
}
