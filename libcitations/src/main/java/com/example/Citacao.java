package com.example;

/**
 * Created by flaviayeshua on 30/08/15.
 */
public class Citacao {

    private String conteudo;
    private String autor;

    public Citacao()
    {
    }

    public Citacao(String conteudo, String autor)
    {
        setConteudo(conteudo);
        setAutor(autor);
    }

    public String getConteudo()
    {
        return conteudo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setConteudo(String conteudo)
    {
        this.conteudo = conteudo;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }
}
