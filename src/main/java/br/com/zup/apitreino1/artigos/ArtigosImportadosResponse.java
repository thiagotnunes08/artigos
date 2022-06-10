package br.com.zup.apitreino1.artigos;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class ArtigosImportadosResponse {

    @JsonProperty("data")
    private List<ArtigosImportados> artigosImportados;

    public List<ArtigosImportados> getArtigosImportados() {
        return artigosImportados;
    }



    public List<Artigos> toArtigos() {

        return artigosImportados.stream()
                .filter(ArtigosImportados::ContemTituloOuTituloHistoria)
                .map(artigo -> artigo.toArtigos().orElseThrow(()-> new IllegalArgumentException("Deveria ter um artigo valido aki")))
                .collect(Collectors.toList());
    }
}
