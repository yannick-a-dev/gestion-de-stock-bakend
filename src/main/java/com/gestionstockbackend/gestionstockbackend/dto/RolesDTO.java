package com.gestionstockbackend.gestionstockbackend.dto;

import java.util.List;

import com.gestionstockbackend.gestionstockbackend.models.Roles;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDTO {
	
	private Integer id;

	private String roleName;

	private UtilisateurDTO utilisateur;

	public static List<RolesDTO> fromEntity(List<Roles> roles) {
		// TODO Auto-generated method stub
		return null;
	}
}
