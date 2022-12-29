package model;

import java.util.List;

public class Automovel {
    private String placa;
    private String cor;
    private int nrportas;
    private int tipo_combustivel;
    private long quilometragem;
    private long renavan;
    private String chassi;
    private double valor_locacao;
    private Modelo modelo;
    private List<Locacao> locacaoList;

    public Automovel() {
    }

    public Automovel(String placa, String cor, int nrportas, int tipo_combustivel, long quilometragem, long renavan, String chassi, double valor_locacao) {
        this.placa = placa;
        this.cor = cor;
        this.nrportas = nrportas;
        this.tipo_combustivel = tipo_combustivel;
        this.quilometragem = quilometragem;
        this.renavan = renavan;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
    }

    public Automovel(String placa, String cor, int nrportas, int tipo_combustivel, long quilometragem, long renavan, String chassi, double valor_locacao, Modelo modelo) {
        this.placa = placa;
        this.cor = cor;
        this.nrportas = nrportas;
        this.tipo_combustivel = tipo_combustivel;
        this.quilometragem = quilometragem;
        this.renavan = renavan;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
        this.modelo = modelo;
    }

    public Automovel(String placa, String cor, int nrportas, int tipo_combustivel, long quilometragem, long renavan, String chassi, double valor_locacao, Modelo modelo, List<Locacao> locacaoList) {
        this.placa = placa;
        this.cor = cor;
        this.nrportas = nrportas;
        this.tipo_combustivel = tipo_combustivel;
        this.quilometragem = quilometragem;
        this.renavan = renavan;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
        this.modelo = modelo;
        this.locacaoList = locacaoList;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNrportas() {
        return nrportas;
    }

    public void setNrportas(int nrportas) {
        this.nrportas = nrportas;
    }

    public int getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(int tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public long getRenavan() {
        return renavan;
    }

    public void setRenavan(long renavan) {
        this.renavan = renavan;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public List<Locacao> getLocacaoList() {
        return locacaoList;
    }

    public void setLocacaoList(List<Locacao> locacaoList) {
        this.locacaoList = locacaoList;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", nrportas=" + nrportas +
                ", tipo_combustivel=" + tipo_combustivel +
                ", quilometragem=" + quilometragem +
                ", renavan=" + renavan +
                ", chassi='" + chassi + '\'' +
                ", valor_locacao=" + valor_locacao +
                ", modelo=" + modelo +
                ", locacaoList=" + locacaoList +
                '}';
    }
}
