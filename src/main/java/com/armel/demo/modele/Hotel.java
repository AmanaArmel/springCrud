package com.armel.demo.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.Map;


@Entity
@Table(name="HOTEL")
@Getter
@Setter
@NoArgsConstructor

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String nom;
    @Column(length = 500)
    private String description;
    private String localisation;
    private int prix;
    private String note;
}
