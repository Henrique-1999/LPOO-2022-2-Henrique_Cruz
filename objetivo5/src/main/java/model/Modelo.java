package model;

import java.util.List;

public class Modelo {
    private String descricao;
    private Marca marca;
    private List<Automovel> automovelList;
    private int codmodelo;

    public Modelo() {
    }

    public Modelo(String descricao, List<Automovel> automovelList, int codmodelo) {
        this.descricao = descricao;
        this.automovelList = automovelList;
        this.codmodelo = codmodelo;
    }

    public Modelo(String descricao, int codmodelo) {
        this.descricao = descricao;
        this.codmodelo = codmodelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Automovel> getAutomovelList() {
        return automovelList;
    }

    public void setAutomovelList(List<Automovel> automovelList) {
        this.automovelList = automovelList;
    }

    public int getCodmodelo() {
        return codmodelo;
    }

    public void setCodmodelo(int codmodelo) {
        this.codmodelo = codmodelo;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "descricao='" + descricao + '\'' +
                ", marca=" + marca +
                ", automovelList=" + automovelList +
                ", codmodelo=" + codmodelo +
                '}';
    }

    Modelo modelo = new Modelo("modelo1",1);
}


