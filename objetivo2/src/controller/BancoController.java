package controller;

import model.*;

import java.util.*;

public class BancoController {

    public static void main(String[] args) {

        //a)
        ContaPoupanca cp1 = new ContaPoupanca(1,1000);
        ContaPoupanca cp2 = new ContaPoupanca(2,1500);
        ContaPoupanca cp3 = new ContaPoupanca(3,50);
        ContaCorrente cc1 = new ContaCorrente(4,1000,300);
        ContaCorrente cc2 = new ContaCorrente(5,3000,600);
        ContaCorrente cc3 = new ContaCorrente(6,5000,450);
        Associado a1 = new Associado("Paulo Ribeiro", 247);
        Associado a2 = new Associado("Joanna Martins", 322);
        Associado a3 = new Associado("Nathalia Santos", 579);

        System.out.println("\n a) \n");

        System.out.println("\n"+ cp1 + "\n" + cp2 + "\n" + cp3);
        System.out.println("\n" + cc1 + "\n" + cc2 + "\n" + cc3);
        System.out.println("\n" + a1 + "\n" + a2 + "\n" + a3);

        //b)

        List<Conta> contas = new ArrayList<>();
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);

        System.out.println("\n b) \n" + contas);

        List<AssociadoVip> avips = new ArrayList<>();
        avips.add(cc1);
        avips.add(cc2);
        avips.add(cc3);
        avips.add(a1);
        avips.add(a2);
        avips.add(a3);

        System.out.println(avips);

        //c)
        System.out.println("\nc)\n");

        cp1.deposita(1000);
        cp1.atualiza(0.05);
        cp1.saca(50);

        //d)

        System.out.println("\nd)\n");

        cc1.deposita(500);
        cc1.saca(400);

        //e)

        System.out.println("\ne)\n");

        cc1.setQdeCotas(100);
        cc2.setQdeCotas(400);
        cc3.setQdeCotas(600);
        a1.setQdeCotas(300);
        a2.setQdeCotas(600);
        a3.setQdeCotas(600);
        System.out.println(avips);

        //f)

        System.out.println("\nf)\n");

        List<Associado> associados = new ArrayList<>();
        associados.add(a1);
        associados.add(a2);
        associados.add(a3);

        associados.sort(Comparator.comparingInt(Associado::getQdeCotas).reversed());

        System.out.println("\nAssociados em ordem drecrescente:\n" + associados);

        System.out.println("\nAssociados com maior quantidade de cotas:\n");
        Associado maiorQdeCotas = Collections.max(associados, Comparator.comparing(Associado::getQdeCotas));
        associados.forEach(assoc -> {
            if(assoc.getQdeCotas() >= maiorQdeCotas.getQdeCotas()){
                System.out.println(assoc);
            }

        });


        //g)

        System.out.println("\ng)\n");

        contas.sort(Comparator.comparingDouble(Conta::getSaldo).reversed());
        System.out.println("Contas em ordem decrescente:" + contas + "\n");

        List<ContaCorrente> contaCorrentes = new ArrayList<>();
        contaCorrentes.add(cc1);
        contaCorrentes.add(cc2);
        contaCorrentes.add(cc3);

        System.out.println("\nConta com maior saldo:\n");
        System.out.println("Associados com conta no sistema: \n" + contaCorrentes);
        Conta maiorSaldo = Collections.max(contas, Comparator.comparing(Conta::getSaldo));
        contas.forEach(c -> {
            if(c.getSaldo() >= maiorSaldo.getSaldo()){
                System.out.println(c);
            }

        });



    }
}
