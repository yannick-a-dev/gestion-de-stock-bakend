package com.gestionstockbackend.gestionstockbackend.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDTO {
	
	private Integer id;

	private String nom;

	private String prenom;
	
	private AdresseDTO adresse;

	private String photo;

	private String mail;

	private String numTel;

	@JsonIgnore
	private List<CommandeClientDTO> commandeClients;
}
