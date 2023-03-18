package com.armel.demo.service;

import com.armel.demo.modele.Client;
import com.armel.demo.modele.Hotel;
import com.armel.demo.repository.ClientRepository;
import com.armel.demo.repository.HotelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ClientServiceImplementation implements ClientService{

    private final ClientRepository clientRepository;
    @Override
    public Client creer(Client client)  {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> lire() {
        return clientRepository.findAll();
    }

    @Override
    public Client modifier(Long id, Client client) {
        return clientRepository.findById(id)

                .map(p -> {
                    p.setNom(client.getNom());
                    p.setPrenom(client.getPrenom());
                    p.setPassword(client.getPassword());
                    return clientRepository.save(p);
                }).orElseThrow(()->new RuntimeException("Client non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        clientRepository.deleteById(id);
        return "Client supprimé";
    }
}
