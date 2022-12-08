package model;

import java.util.List;

public class Vendedor extends Funcionario{
    private String local;
    List<Pedido> pedidos;

    public void realizarpedido(){

    };
    public void consultarpedido(){

    };

    public Vendedor() {
    }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local, List<Pedido> pedidos) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
        this.pedidos = pedidos;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
