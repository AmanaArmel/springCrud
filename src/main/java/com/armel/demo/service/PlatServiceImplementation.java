package com.armel.demo.service;


import com.armel.demo.modele.Plat;
import com.armel.demo.repository.PlatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor


public class PlatServiceImplementation implements PlatService{
    private final PlatRepository platRepository;
    @Override
    public Plat creer(Plat plat)  {
        return platRepository.save(plat);
    }

    @Override
    public List<Plat> lire() {
        return platRepository.findAll();
    }

    @Override
    public Plat modifier(Long id, Plat plat) {
        return platRepository.findById(id)

                .map(p -> {
                    p.setNom(plat.getNom());
                    p.setDescription(plat.getDescription());
                    p.setLocalisation(plat.getLocalisation());
                    p.setTradition(plat.getTradition());
                    return platRepository.save(p);
                }).orElseThrow(()->new RuntimeException("Plat non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        platRepository.deleteById(id);
        return "Plat supprimé";
    }
}
