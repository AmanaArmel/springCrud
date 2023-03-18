package com.armel.demo.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Entity
@Table(name="PLAT")
@Getter
@Setter
@NoArgsConstructor

public class Plat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length =50)
    private String nom;
    @Column(length = 500)
    private String description;
    private String tradition;
    private String localisation;

}
