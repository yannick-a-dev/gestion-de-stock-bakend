package com.gestionstockbackend.gestionstockbackend.dto;

import java.util.List;

import com.gestionstockbackend.gestionstockbackend.models.Entreprise;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrepriseDTO {
	
	private Integer id;

	private String nom;
	
	private String description;
	
	private AdresseDTO adresse;
	
	private String codeFiscal;
	
	private String photo;
	
	private String email;
	
	private String numTel;

	private String siteWeb;
	
	private List<UtilisateurDTO> utilisateurs;

	public static EntrepriseDTO fromEntity(Entreprise entreprise) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
