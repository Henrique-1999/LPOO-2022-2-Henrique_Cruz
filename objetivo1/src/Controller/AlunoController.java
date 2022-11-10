package Controller;

import model.*;

import java.util.*;

public class AlunoController {

    public static void main(String[] args){
        //1.a
        //Construtor padrão:
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        //Construtor parametrizado com todos os atributos:

        Aluno aluno3 = new Aluno(3,"079.986.740-12","Pedro","Garcia","pedrinho@gmail.com");
        Aluno aluno4 = new Aluno(4,"097.876.328-72","Marina","Ribeiro","mariribeiro@gmail.com");

        //Construtor parametrizado com 2 atributos
        Aluno aluno5 = new Aluno(5,"Paulo");
        Aluno aluno6 = new Aluno(6,"Joana");

        //Imprimindo com o comportamento ToString:
        System.out.println("\n Imprimindo alunos com o comportamento ToString:");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
        System.out.println(aluno6);

        //1.b
        //Alterando o estado com os métodos setters:
        aluno1.setId(1);
        aluno1.setCpf("096.762.170-62");
        aluno1.setNome("Marcos");
        aluno1.setSobrenome("Silva");
        aluno1.setEmail("msilva@outlook.com");

        aluno2.setId(2);
        aluno2.setCpf("066.573.438-27");
        aluno2.setNome("Fernanda");
        aluno2.setSobrenome("Souza");
        aluno2.setEmail("fesouza@yahoo.com");

        //Imprimindo com o método getter:
        System.out.println("\n Imprimindo alunos com os métodos getters:");
        System.out.println(aluno1.getId() + " " + aluno1.getCpf() + " " + aluno1.getNome() + " " + aluno1.getSobrenome() + " " + aluno1.getEmail() );
        System.out.println(aluno2.getId() + " " + aluno2.getCpf() + " " + aluno2.getNome() + " " + aluno2.getSobrenome() + " " + aluno2.getEmail() + "\n");

        //2
        //Criando e manipulando a coleção list

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);

        System.out.println("Imprimindo a coleção list:");
        System.out.println(alunos + "\n");

        //Imprimindo o objeto de id 5
        System.out.println("Imprimindo o objeto com id 5:");
        Aluno buscaaluno = alunos.stream().filter(a -> a.getId() == (5)).findAny().orElse(null);
        System.out.println(buscaaluno + "\n");

        //Ordenando os objetos pelo id na ordem decrescente:
        alunos.sort(Comparator.comparingInt(Aluno :: getId).reversed());
        System.out.println("Imprimindo a list na ordem decrescente:");
        System.out.println(alunos + "\n");

        //Criando e manipulando a coleção map:
        Map<Integer, Aluno>alunoMap = new HashMap<>();
        alunoMap.put(aluno1.getId(), aluno1);
        alunoMap.put(aluno2.getId(), aluno2);
        alunoMap.put(aluno3.getId(), aluno3);
        alunoMap.put(aluno4.getId(), aluno4);
        alunoMap.put(aluno5.getId(), aluno5);
        alunoMap.put(aluno6.getId(), aluno6);
        System.out.println("Imprimindo a coleção map:" + "\n");
        System.out.println(alunoMap + "\n");

        System.out.println("Imprimindo o objeto de id 5 na coleção map");
        System.out.println(alunoMap.get(aluno5.getId()));
    }
}
