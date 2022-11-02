package com.gestionstockbackend.gestionstockbackend.dto;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDTO {
	
	private Integer id;

	private String code;
	
	private Instant dateVente;

	private String commentaire;
}
