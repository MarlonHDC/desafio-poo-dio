package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class BootcampPro extends Bootcamp

{

    private String nomePro;
    private String descricaoPro;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);//"plusDays" refere-se ao prazo após a data inicial;

    private Set<DevPro> devsInscritos = new HashSet<>();//"HashSet" porque a ordem de inscrição não é relevante para o caso;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();//"LinkedHashSet" já aqui a ordem de inserção dos conteúdos é importante;

    public String getNome() {
        return nomePro;
    }

    public void setNome(String nome) {
        this.nomePro = nome;
    }

    public String getDescricao() {
        return descricaoPro;
    }

    public void setDescricao(String descricao) {
        this.descricaoPro = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<DevPro> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<DevPro> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nomePro, bootcamp.nome) && Objects.equals(descricaoPro, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
