package br.com.zup.apitreino1.artigos;

import javax.persistence.*;

@Entity
public class Artigos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(nullable = false)
    private String titulo;
   // @Column(nullable = false)
    private String autor;

    public Artigos(String titulo) {
        this.titulo = titulo;
    }

    public Artigos(String titulo, String autor) {
    }

    public String getTitulo() {
        return titulo;
    }

    @Deprecated // para uso interno da api
    public Artigos(){

    }

    @Override
    public String toString() {
        return "Artigos{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
