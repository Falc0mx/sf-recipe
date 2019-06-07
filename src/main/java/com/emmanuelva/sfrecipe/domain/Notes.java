package com.emmanuelva.sfrecipe.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob // Makes a large object in DB (BLOB)
    private String recipeNotes;

}
