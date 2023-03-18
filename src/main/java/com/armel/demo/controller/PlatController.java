package com.armel.demo.controller;


import com.armel.demo.modele.Hotel;
import com.armel.demo.modele.Plat;
import com.armel.demo.service.HotelService;
import com.armel.demo.service.PlatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/plat")
@AllArgsConstructor

public class PlatController {
    private final PlatService platService;

    @PostMapping("/create")
    public Plat create(@RequestBody  Plat plat){
        return platService.creer(plat);
    }
    @GetMapping("/read")
    public List<Plat> read(){
        return platService.lire();
    }
    @PutMapping("/update/{id}")
    public Plat update(@PathVariable Long id, @RequestBody Plat plat){
        return platService.modifier(id,plat);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return platService.supprimer(id);
    }

}
