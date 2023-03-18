package com.armel.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.armel.demo.modele.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Long>{
}
