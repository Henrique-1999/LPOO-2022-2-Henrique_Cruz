package model;

public abstract class Conta {

    protected int id;

    protected double saldo;

    public void deposita(double valor){
        saldo = saldo + valor;
        System.out.println("Conta " +  id + ":\n" + "Novo saldo: " + saldo );
    }

    public void saca(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Conta " +  id + ":\n" +  "Novo saldo: " + saldo);
        }
        else {
            System.out.println( "Conta " +  id + ":\n" + "Saldo insuficiente para realizar saque");
        }
    }

    public void atualiza(double taxa){
        saldo = saldo + saldo * taxa;
        System.out.println( "Conta " +  id + ":\n" + "Novo saldo: " + saldo );
    }

    public Conta() {
    }

    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
