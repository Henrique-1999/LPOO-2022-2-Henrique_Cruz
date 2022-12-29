package controller;

import model.*;

import java.util.*;
public class LojaController {

    public static void main(String[] args) {
        //b)
        Vendedor v1 = new Vendedor(1427,"Pedro Amaral","Casa do pedro 1234","Fragata","79108-280","Pelotas","Rio Grande do Sul","loja");
        Vendedor v2 = new Vendedor(1772,"Ana Souza","Casa da ana 1234","Gotuzzo","59604-310","Pelotas","Rio Grande do Sul","loja");

        Produto p1 = new Produto(123, "Celular",500,750);
        Produto p2 = new Produto(4567,"Conjunto de panelas",500,120);

        Item it1 = new Item(1,0.05,1,p1);
        Item it2 = new Item(2,0.01,1,p1);
        Item it3 = new Item(3,0.01,1,p1);
        Item it4 = new Item(4,0.02,2,p2);
        Item it5 = new Item(5,0.02,1,p2);
        Item it6 = new Item(6,0.02,1,p2);

        List<Item>itemList1 = new ArrayList<>();
        itemList1.add(it1);
        itemList1.add(it2);
        itemList1.add(it3);

        List<Item>itemList2 = new ArrayList<>();
        itemList2.add(it4);
        itemList2.add(it4);
        itemList2.add(it4);
        itemList2.add(it4);



        Pedido ped1 = new Pedido(1,750,v1,itemList1);
        Pedido ped2 = new Pedido(2,120,v2,itemList2);


        List<Pedido>vendas = new ArrayList<>();
        vendas.add(ped1);
        vendas.add(ped2);
        System.out.println(vendas);

    }
}
