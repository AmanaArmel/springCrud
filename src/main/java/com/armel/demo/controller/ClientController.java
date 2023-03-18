package com.armel.demo.controller;


import com.armel.demo.modele.Client;
import com.armel.demo.modele.Hotel;
import com.armel.demo.service.ClientService;
import com.armel.demo.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/client")
@AllArgsConstructor

public class ClientController {

    private final ClientService clientService;

    @PostMapping("/create")
    public Client create(@RequestBody Client client){
        return clientService.creer(client);
    }
    @GetMapping("/read")
    public List<Client> read(){
        return clientService.lire();
    }
    @PutMapping("/update/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client client){
        return clientService.modifier(id,client);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return clientService.supprimer(id);
    }

}
