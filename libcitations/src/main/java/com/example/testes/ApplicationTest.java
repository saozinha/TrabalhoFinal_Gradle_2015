package com.example.testes;

import com.example.CitationProvider;

/**
 * Created by ConceicaoLourenco on 07/09/2015.
 */
public class ApplicationTest {


    public static void teste_AddCitacao() {
        CitationProvider cp = new CitationProvider();

        if (!(cp.addCitation(System.getProperty("teste.citacao"),System.getProperty("teste.autor")))) {
            System.out.println("teste_AddCitacao - Erro ao adicionar citacao !!");
        } else {
            System.out.println("teste_AddCitacao - Citacao Adicionada !!");
        }

    }

    public static void main(String[] args) {
       // System.out.println(System.getProperty("teste.citacao") + args[0] +"\n" + args[1] + System.getProperty("teste.autor"));

        teste_AddCitacao();
    }

}
