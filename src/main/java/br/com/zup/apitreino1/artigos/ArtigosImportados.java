package br.com.zup.apitreino1.artigos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArtigosImportados {

    @JsonProperty("title")
    private String titulo;
    @JsonProperty("author")
    private String autor;
    @JsonProperty("story_title")
    private String tituloHistoria;



    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTituloHistoria() {
        return tituloHistoria;
    }

    @Override
    public String toString() {
        return "ArtigosImportados{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tituloHistoria='" + tituloHistoria + '\'' +
                '}';
    }
}
