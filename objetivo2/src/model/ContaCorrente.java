package model;

public class ContaCorrente extends Conta implements AssociadoVip{

    private int qdeCotas;
    public double lucro;

    public double lucros(int qdeCotas, double valorCota){
        return lucro;

    }

    public ContaCorrente() {
    }

    public ContaCorrente(int id, double saldo, int qdeCotas) {
        super(id, saldo);
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
        return "ContaCorrente{" +
                "id=" + id +
                ", saldo=" + saldo +
                ", qdeCotas=" + qdeCotas +
                '}';
    }

}
