package br.com.zup.apitreino1.artigos;

import java.util.List;
import java.util.stream.Collectors;

public class ArtigosResponses {

    private final int total;
    private final List<TitulosResponses> titulos;

    public ArtigosResponses(List<Artigos> artigosResponses) {
        this.total = artigosResponses.size();
        titulos = artigosResponses.stream().map(artigos -> new TitulosResponses(artigos.getTitulo())).collect(Collectors.toList());

    }

    public int getTotal() {
        return total;
    }

    public List<TitulosResponses> getTitulos() {
        return titulos;
    }
}
