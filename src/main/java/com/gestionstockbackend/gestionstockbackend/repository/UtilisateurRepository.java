package com.gestionstockbackend.gestionstockbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstockbackend.gestionstockbackend.models.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
