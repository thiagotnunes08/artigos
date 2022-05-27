package br.com.zup.apitreino1.artigos;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class ImportaArtigosRequest {

    @NotBlank
    @JsonProperty("autor")
    private String nomeAutor;

    public String getNomeAutor() {
        return nomeAutor;
    }
}
