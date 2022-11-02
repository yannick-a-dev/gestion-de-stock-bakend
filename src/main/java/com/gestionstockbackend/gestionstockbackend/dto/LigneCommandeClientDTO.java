package com.gestionstockbackend.gestionstockbackend.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeClientDTO {
	
	private Integer id;

	private ArticleDTO article;

	private CommandeClientDTO commandeClient;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;
}
