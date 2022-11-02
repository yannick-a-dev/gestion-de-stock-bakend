package com.gestionstockbackend.gestionstockbackend.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeFournisseurDTO {
	
	private Integer id;

	private ArticleDTO article;

	private CommandeFournisseurDTO commandeFournisseur;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;
}
