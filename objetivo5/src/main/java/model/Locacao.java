package model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Locacao {
    private LocalDate dt_locacao;
    private LocalTime hora_locacao;
    private Date dt_devolucao;
    private Time hora_devolucao;
    private long quilometragem;
    private double valor_caucao;
    private double valor_locacao;
    private int devolvido;
    private Automovel automovel;
    private Cliente cliente;
}
