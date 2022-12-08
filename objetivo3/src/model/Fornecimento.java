package model;

import java.util.Date;

public class Fornecimento {
    private Date data;
    private double valorTotal;

    private Produto produto;
    private Fornecedor fornecedor;

    public Fornecimento(Date data, double valorTotal, Produto produto, Fornecedor fornecedor) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Fornecimento{" +
                "data=" + data +
                ", valorTotal=" + valorTotal +
                ", produto=" + produto +
                ", fornecedor=" + fornecedor +
                '}';
    }
}
