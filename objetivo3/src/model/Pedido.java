package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDate data = LocalDate.now();
    private double valor;
    private Vendedor vendedor;
    private Tipo tipo = Tipo.atendido;
    List<Item>itens;
    public Pedido() {
    }

    public Pedido(int numero, double valor, Vendedor vendedor, List<Item> itens) {
        this.numero = numero;
        this.valor = valor;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", vendedor=" + vendedor.nome +
                ", tipo=" + tipo +
                ", itens=" + itens +
                '}';
    }
}
