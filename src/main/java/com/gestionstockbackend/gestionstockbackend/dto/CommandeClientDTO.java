package com.gestionstockbackend.gestionstockbackend.dto;

import java.time.Instant;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDTO {
	
	private Integer id;

	private String code;

	private Instant dateCommande;
	
	private ClientDTO client;
	
	private List<LigneCommandeClientDTO> ligneCommandeClients;
}
