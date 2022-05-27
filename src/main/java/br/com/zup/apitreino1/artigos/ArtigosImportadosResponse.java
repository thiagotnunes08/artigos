package br.com.zup.apitreino1.artigos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ArtigosImportadosResponse {

    @JsonProperty("data")
    private List<ArtigosImportados> artigosImportados;

    public List<ArtigosImportados> getArtigosImportados() {
        return artigosImportados;
    }

    @Override
    public String toString() {
        return "ArtigosImportadosResponse{" +
                "artigosImportados=" + artigosImportados +
                '}';
    }
}
