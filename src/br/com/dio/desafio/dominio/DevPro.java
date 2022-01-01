package br.com.dio.desafio.dominio;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class DevPro  {

    private String nomePro;
    private Set<Conteudo> conteudosInscritosPro = new LinkedHashSet<>(); // O "LinkedHashSet" foi utilizado porque só aceita uma inscrição;
    private Set<Conteudo> conteudosConcluidosPro = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritosPro.addAll(bootcamp.getConteudos());//Adicionando todos "addAll" conteúdos "getConteudos" aos inscritos no Bootcamp;
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritosPro.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidosPro.add(conteudo.get());
            this.conteudosInscritosPro.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXpPro () {
        return this.conteudosConcluidosPro
                .stream()
                .mapToDouble(Conteudo::calcularXpPro)
                .sum();
    }

    public String getNome () {
        return nomePro;
    }


    public void setNome (String nome){
        this.nomePro = nome;
    }

    public Set<Conteudo> getConteudosInscritos () {
        return conteudosInscritosPro;
    }

    public void setConteudosInscritos (Set < Conteudo > conteudosInscritos) {
        this.conteudosInscritosPro = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidosPro () {
        return conteudosConcluidosPro;
    }

    public void setConteudosConcluidosPro (Set < Conteudo > conteudosConcluidos) {
        this.conteudosConcluidosPro = conteudosConcluidos;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nomePro, dev.nomePro) && Objects.equals(conteudosInscritosPro, dev.conteudosInscritosPro) && Objects.equals(conteudosConcluidosPro, dev.conteudosConcluidosPro);
    }

    @Override
    public int hashCode () {
        return Objects.hash(nomePro, conteudosInscritosPro, conteudosConcluidosPro);
    }

}
