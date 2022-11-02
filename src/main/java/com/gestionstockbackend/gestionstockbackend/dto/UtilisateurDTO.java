package com.gestionstockbackend.gestionstockbackend.dto;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import com.gestionstockbackend.gestionstockbackend.models.Article;
import com.gestionstockbackend.gestionstockbackend.models.Utilisateur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDTO {

	private Integer id;

	private String nom;

	private String prenom;

	private AdresseDTO adresse;

	private String photo;

	private Instant dateDeNaissance;

	private String motDePasse;

	private String email;

	private EntrepriseDTO entreprise;

	private List<RolesDTO> roles;

	public static UtilisateurDTO fromEntity(Utilisateur utilisateur) {
		if (utilisateur == null) {
			return null;
		}

		return UtilisateurDTO.builder().id(utilisateur.getId()).nom(utilisateur.getNom())
				.prenom(utilisateur.getPrenom()).email(utilisateur.getEmail()).motDePasse(utilisateur.getMotDePasse())
				.dateDeNaissance(utilisateur.getDateDeNaissance())
				.adresse(AdresseDTO.fromEntity(utilisateur.getAdresse()))
				.photo(utilisateur.getPhoto())
				.entreprise(EntrepriseDTO.fromEntity(utilisateur.getEntreprise()))
				.roles(RolesDTO.fromEntity(utilisateur.getRoles()))
				.build();

	}

	public Utilisateur toEntity(UtilisateurDTO utilisateurDTO) {
		if (utilisateurDTO == null) {
			return null;
		}

		Utilisateur utilisateur = new Utilisateur();

		return utilisateur;
	}
}