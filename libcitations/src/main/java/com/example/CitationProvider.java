package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class CitationProvider {

    private List<Citacao> citacoes = new ArrayList<Citacao>();
    private static int ultimo = -1;

    public Citacao obterCitation()
    {
        Random gerador = new Random();

        int numeroCitacao = gerador.nextInt(citacoes.size());

        if (citacoes.size() > 1) {

            while (numeroCitacao == ultimo) {

                numeroCitacao = gerador.nextInt(citacoes.size());

            }
        }

        ultimo = numeroCitacao;

        return citacoes.get(numeroCitacao);
    }

    public void addCitation(String conteudo, String autor)
    {
        if (!(conteudo.isEmpty() && autor.isEmpty()) && autor.length() <= 30 && conteudo.length() <= 200 ){
            Citacao citacao = new Citacao(conteudo, autor);
            citacoes.add(citacao);
        } else {
            System.out.println("Erro na adicinado de citacao !!");
        }
    }
}