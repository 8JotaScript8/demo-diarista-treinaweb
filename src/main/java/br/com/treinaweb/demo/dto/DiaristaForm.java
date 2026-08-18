package br.com.treinaweb.demo.dto;

import java.util.Objects;


public class DiaristaForm {
    
    private String nome;

    private String cpf;

    private String telefone;

    private String endereco;

    public DiaristaForm() {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, telefone, endereco);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        DiaristaForm other = (DiaristaForm) obj;
        return Objects.equals(nome, other.nome)
                && Objects.equals(cpf, other.cpf)
                && Objects.equals(telefone, other.telefone)
                && Objects.equals(endereco, other.endereco);
    }

    @Override
    public String toString() {
        return "DiaristaForm [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", endereco=" + endereco + "]";
    }
}
