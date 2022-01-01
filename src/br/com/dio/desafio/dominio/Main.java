package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso(); // Atribuição do objeto "curso1"
        curso1.setTitulo("Curso Java"); // Definições do curso
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(); // Atribuição do objeto "curso2"
        curso2.setTitulo("Curso Java Script"); // Definições do curso
        curso2.setDescricao("Descrição curso Java Script");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now()); // "LocalDate.now" retorna a data no momento da criação;



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        //Criação do Bootcamp;
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //Criação Dev 1, Marlon;
        Dev devMarlon = new Dev();
        devMarlon.setNome("Marlon");// Instanciando o nome;
        devMarlon.inscreverBootcamp(bootcamp);//inscrição no Bootcamp;
        System.out.println("Conteúdos inscritos Marlon " + devMarlon.getConteudosInscritos());
        System.out.println("XP atual de Marlon " + devMarlon.calcularTotalXp());//Exibição de XP;
        devMarlon.progredir();//Progredindo no Bootcamp. Lógica feita na classe "Dev";
        devMarlon.progredir();//Progredindo pela segunda vez no Bootcamp. Lógica feita na classe "Dev";
        System.out.println("Atualização após progressão no curso: ");
        System.out.println("Conteúdos inscritos após progressão Marlon " + devMarlon.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Marlon " + devMarlon.getConteudosConcluidos());
        System.out.println("XP atual de Marlon " + devMarlon.calcularTotalXp());//Exibição de XP;


        System.out.println("-------");

        //Criação Dev 2 Dani;
        Dev devDani = new Dev();
        devDani.setNome("Dani");// Instanciando o nome;
        devDani.inscreverBootcamp(bootcamp);//inscrição no Bootcamp;
        System.out.println("Conteúdos inscritos Dani " + devDani.getConteudosInscritos());
        devDani.progredir();//Progredindo no Bootcamp. Lógica feita na classe "Dev";
        devDani.progredir();//Progredindo no Bootcamp segunda vez. Lógica feita na classe "Dev";
        devDani.progredir();//Progredindo no Bootcamp terceira vez. Lógica feita na classe "Dev";
        System.out.println("Atualização após progressão no curso: ");
        System.out.println("Conteúdos inscritos após progressão Dani " + devDani.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Marlon " + devMarlon.getConteudosConcluidos());
        System.out.println("XP atual de Dani " + devDani.calcularTotalXp());//Exibição de XP;

        System.out.println("-------");

        //Criação DevPro 3; Laisa;
        DevPro devProLaisa = new DevPro();
        devProLaisa.setNome("Laisa");
        devProLaisa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Laisa" + devProLaisa.getConteudosInscritos());
        System.out.println("XP atual de Laisa " + devProLaisa.calcularTotalXpPro());
        devProLaisa.progredir();
        System.out.println("Atualização após progressão no curso: ");
        System.out.println("Conteúdos inscritos após progressão Laisa " + devProLaisa.getConteudosInscritos());
        System.out.println("XP atual de Laisa " + devProLaisa.calcularTotalXpPro()); //Progredindo no Bootcamp. Lógica feita na classe "Dev";
        devProLaisa.progredir();
        System.out.println("Conteúdos inscritos após progressão Laisa " + devProLaisa.getConteudosInscritos());
        System.out.println("XP atual de Laisa " + devProLaisa.calcularTotalXpPro());

    }
}
