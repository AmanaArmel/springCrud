package com.armel.demo.modele;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Entity
@Table(name="CLIENT")
@Getter
@Setter
@NoArgsConstructor

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length =50)
    private String nom;
    @Column(length =50)
    private String prenom;
    private String mail;
    private String password;
}






