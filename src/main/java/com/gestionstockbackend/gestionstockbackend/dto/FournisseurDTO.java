package com.gestionstockbackend.gestionstockbackend.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FournisseurDTO {
	
	private Integer id;

	private String nom;

	private String prenom;

	private AdresseDTO adresse;

	private String photo;
	
	private String mail;

	private String numTel;

	private List<CommandeFournisseurDTO> commandeFournisseurs;
	
}
