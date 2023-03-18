package com.armel.demo.service;


import com.armel.demo.modele.Plat;

import java.util.List;

public interface PlatService {

    Plat creer(Plat hotel);

    List<Plat> lire();

    Plat modifier(Long id, Plat hotel);

    String supprimer(Long id);
}
