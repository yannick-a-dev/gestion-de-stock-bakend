package com.gestionstockbackend.gestionstockbackend.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDTO {
	
	private Integer id;

	private VentesDTO ventes;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;
}
