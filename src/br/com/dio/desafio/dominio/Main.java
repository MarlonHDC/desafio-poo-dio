package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso(); // Atribuição do objeto "curso1"
        curso1.setTitulo("Curso Java"); // Definições do curso
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); // Atribuição do objeto "curso1"
        curso2.setTitulo("Curso Java"); // Definições do curso
        curso2.setDescricao("Descrição curso Java Script");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now()); // "LocalDate.now" retorna a data no momento da criação;



        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
