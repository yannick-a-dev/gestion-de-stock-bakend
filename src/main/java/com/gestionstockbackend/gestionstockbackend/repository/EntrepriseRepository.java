package com.gestionstockbackend.gestionstockbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstockbackend.gestionstockbackend.models.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}
