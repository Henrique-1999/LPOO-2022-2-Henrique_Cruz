package model;

import java.util.List;

public class Fornecedor {
    private int cnpj;
    private String contato;
    private String nome;
    List<Produto> produtos;

    public Fornecedor() {
    }

    public Fornecedor(int cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public Fornecedor(int cnpj, String contato, String nome, List<Produto> produtos) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produtos = produtos;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "cnpj=" + cnpj +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
