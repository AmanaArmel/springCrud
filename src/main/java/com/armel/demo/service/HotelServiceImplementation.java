package com.armel.demo.service;

import com.armel.demo.modele.Hotel;
import com.armel.demo.repository.HotelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class HotelServiceImplementation implements HotelService{

    private final HotelRepository hotelRepository;
    @Override
    public Hotel creer(Hotel hotel)  {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> lire() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel modifier(Long id, Hotel hotel) {
        return hotelRepository.findById(id)

                .map(p -> {
                    p.setNom(hotel.getNom());
                    p.setDescription(hotel.getDescription());
                    p.setLocalisation(hotel.getLocalisation());
                    p.setPrix(hotel.getPrix());
                    p.setNote(hotel.getNote());
                    return hotelRepository.save(p);
                }).orElseThrow(()->new RuntimeException("Hotel non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        hotelRepository.deleteById(id);
        return "Produit supprimé";
    }
}
