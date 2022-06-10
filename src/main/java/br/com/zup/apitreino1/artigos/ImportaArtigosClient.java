package br.com.zup.apitreino1.artigos;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class ImportaArtigosClient {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String uri = "https://jsonmock.hackerrank.com/api/articles?author=";

    public ArtigosImportadosResponse buscaArtigos(String nomeAutor) {

        try {
            ResponseEntity<ArtigosImportadosResponse> responses = restTemplate
                    .getForEntity(uri + nomeAutor, ArtigosImportadosResponse.class);

            return responses.getBody();




        } catch (RestClientException exception) {
            throw new RuntimeException("ERRO AO TENTAR EXTRAIR DADOS API EXTERNA");


        }



    }

}
