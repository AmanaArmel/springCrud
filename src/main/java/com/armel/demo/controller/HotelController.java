package com.armel.demo.controller;

import com.armel.demo.modele.Hotel;
import com.armel.demo.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/hotel")
@AllArgsConstructor
public class HotelController {

    private final HotelService hotelService;

    @PostMapping("/create")
    public Hotel create(@RequestBody  Hotel hotel){
        return hotelService.creer(hotel);
    }
    @GetMapping("/read")
    public List<Hotel> read(){
        return hotelService.lire();
    }
    @PutMapping("/update/{id}")
    public Hotel update(@PathVariable Long id, @RequestBody Hotel hotel){
        return hotelService.modifier(id,hotel);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return hotelService.supprimer(id);
    }

}
