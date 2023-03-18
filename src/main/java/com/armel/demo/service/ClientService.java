package com.armel.demo.service;

import com.armel.demo.modele.Client;

import java.util.List;
public interface ClientService {

    Client creer(Client client);

    List<Client> lire();

    Client modifier(Long id, Client client);

    String supprimer(Long id);
}
