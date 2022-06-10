package br.com.zup.apitreino1.artigos;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.StringUtils;

import java.util.Optional;

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


    public Optional<Artigos> toArtigos() {

        if (StringUtils.hasText(this.titulo)) {

            return Optional.of(new Artigos(titulo, autor));
        }

        if (StringUtils.hasText(this.tituloHistoria)) {

            return Optional.of(new Artigos(tituloHistoria, autor));
        }
        return Optional.empty();
    }


    public boolean ContemTituloOuTituloHistoria() {

        return StringUtils.hasText(this.titulo) || StringUtils.hasText(this.tituloHistoria);
    }
}
