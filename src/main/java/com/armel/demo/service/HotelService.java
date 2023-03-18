package com.armel.demo.service;

import com.armel.demo.modele.Hotel;

import java.util.List;

public interface HotelService {

    Hotel creer(Hotel hotel);

    List<Hotel> lire();

    Hotel modifier(Long id, Hotel hotel);

    String supprimer(Long id);
}
