package br.com.zup.apitreino1.artigos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("artigos/importador")
public class ImportaArtigosController {


    private final ImportaArtigosClient client;
    private final ImportaArtigosRepository repository;

    @Autowired
    public ImportaArtigosController(ImportaArtigosClient client, ImportaArtigosRepository repository) {
        this.client = client;
        this.repository = repository;
    }

    @PostMapping
    public ArtigosResponses importaArtigos(@Valid @RequestBody ImportaArtigosRequest resquest) {


        ArtigosImportadosResponse artigosImportadosResponse = client.buscaArtigos(resquest.getNomeAutor());

        List<Artigos> artigosResponses = new ArrayList<>();


        artigosImportadosResponse.getArtigosImportados().forEach(artigosRetornadosLambda -> {
            if (artigosRetornadosLambda.getTitulo() != null) {
                artigosResponses.add(repository.save(new Artigos(artigosRetornadosLambda.getTitulo(), artigosRetornadosLambda.getAutor())));
                return;
            }
            if (artigosRetornadosLambda.getTituloHistoria() != null) {

                artigosResponses.add(repository.save(new Artigos(artigosRetornadosLambda.getTituloHistoria(), artigosRetornadosLambda.getAutor())));


            }


        });

        return new ArtigosResponses(artigosResponses);


    }
}
