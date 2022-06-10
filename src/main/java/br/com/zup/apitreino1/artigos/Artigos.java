package br.com.zup.apitreino1.artigos;

import javax.persistence.*;

@Entity
public class Artigos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String autor;

    public Artigos(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Deprecated
    public Artigos() {
        
    }
}
