package com.gestionstockbackend.gestionstockbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstockbackend.gestionstockbackend.models.CommandeClient;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer> {

}
