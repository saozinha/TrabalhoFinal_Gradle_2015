package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;


public class CitationProvider {

    private List<Citacao> citacoes = new ArrayList<Citacao>();
    private static int ultimo = -1;

    // Verifica se a String é null ou vazia ou só tem espaços em branco
    public static boolean isNullOrBlank(String s) {
        return (s == null || s.trim().equals(""));
    }

    // Verifica se a String é null ou vazia
    // Pode ser utilizado como suporte em APIs menores que 9 do android onde não está disponivel o metódo de String isEmpty()
    public static boolean isNullOrEmpty(String s) {
        return (s == null || s.equals(""));
    }


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


    public boolean addCitation(String conteudo, String autor)
    {
        //System.out.println("ADD ---  citacao !!");

        if (!(isNullOrBlank(conteudo) && isNullOrBlank(autor) && autor.length() <= 30 && conteudo.length() <= 200 )){
            Citacao citacao = new Citacao(conteudo, autor);
            citacoes.add(citacao);
            return true;
        } else {
            return false;
        }
    }
}