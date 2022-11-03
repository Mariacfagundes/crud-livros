package com.api.livro.entities;

import javax.persistence.*;
@Entity
@Table(name = "tb_classificacao")
public class Classificacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;

    public Classificacao () {
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
