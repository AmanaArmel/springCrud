package com.armel.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.armel.demo.modele.Plat;



public interface PlatRepository extends JpaRepository<Plat,Long>{
}
