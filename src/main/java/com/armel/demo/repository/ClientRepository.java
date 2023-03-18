package com.armel.demo.repository;

import com.armel.demo.modele.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long>{
}
