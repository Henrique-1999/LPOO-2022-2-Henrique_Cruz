package model;

public class Associado implements AssociadoVip{

    private String nome;

    public int qdeCotas;

    public double lucro;

    public double lucros(int qdeCotas, double valorCota) {
        return lucro;

    }

    public Associado() {
    }

    public Associado(String nome, int qdeCotas) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
    }

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public String toString() {
        return "Associado{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                '}';
    }
}
