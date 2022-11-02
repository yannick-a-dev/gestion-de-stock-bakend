package com.gestionstockbackend.gestionstockbackend.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.gestionstockbackend.gestionstockbackend.dto.UtilisateurDTO;

public class UtilisateurValidator {

	public static List<String> validate(UtilisateurDTO utilisateurDTO){
		List<String> errors = new ArrayList<>();
		
		if(utilisateurDTO == null) {
			errors.add("Veuillez renseigner le nom d'utilisateur");
			errors.add("Veuillez renseigner le prenom d'utilisateur");
			errors.add("Veuillez renseigner le mot de passe d'utilisateur");
			errors.add("Veuillez renseigner l'adresse d'utilisateur");
			return errors;
		}
		
		if(!StringUtils.hasLength(utilisateurDTO.getNom())) {
			errors.add("Veuillez renseigner le nom d'utilisateur");
		}
		
		if(!StringUtils.hasLength(utilisateurDTO.getPrenom())) {
			errors.add("Veuillez renseigner le prenom d'utilisateur");
		}
		
		if(!StringUtils.hasLength(utilisateurDTO.getEmail())) {
			errors.add("Veuillez renseigner l'email d'utilisateur");
		}
		
		if(!StringUtils.hasLength(utilisateurDTO.getMotDePasse())) {
			errors.add("Veuillez renseigner le mot de passe d'utilisateur");
		}
		
		if(utilisateurDTO.getDateDeNaissance()==null) {
			errors.add("Veuillez renseigner la date de naissance d'utilisateur");
		}
		
		if(utilisateurDTO.getAdresse() == null) {
			errors.add("Veuillez renseigner l'adresse d'utilisateur");
		}else {
			if(!StringUtils.hasLength(utilisateurDTO.getAdresse().getAdresse1())) {
				errors.add("Le champs 'Adresse 1' est obligatoire");
			}
			
			if(!StringUtils.hasLength(utilisateurDTO.getAdresse().getVille())) {
				errors.add("Le champs  'ville'est obligatoire");
			}
			
			if(!StringUtils.hasLength(utilisateurDTO.getAdresse().getCodePostale())) {
				errors.add("Le champs 'code postale' est obligatoire");
			}
			
			if(!StringUtils.hasLength(utilisateurDTO.getAdresse().getPays())) {
				errors.add("Le champsPays' est obligatoire");
			}
		}
		
		
		
		return errors;
	}
}
