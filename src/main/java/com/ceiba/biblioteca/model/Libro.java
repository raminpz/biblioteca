package com.ceiba.biblioteca.model;

import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {

    @Id

    private String isbn;

    @NonNull
    private String title;

}
