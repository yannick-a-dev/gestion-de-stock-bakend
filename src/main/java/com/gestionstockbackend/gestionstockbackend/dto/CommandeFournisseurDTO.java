package com.gestionstockbackend.gestionstockbackend.dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDTO {

	private Integer id;

	private String code;

	private Instant dateCommande;

	private FournisseurDTO fournisseur;

	private List<LigneCommandeFournisseurDTO> ligneCommandeFournisseurs;
}
