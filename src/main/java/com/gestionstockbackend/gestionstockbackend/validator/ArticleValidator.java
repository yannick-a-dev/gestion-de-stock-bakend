package com.gestionstockbackend.gestionstockbackend.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.gestionstockbackend.gestionstockbackend.dto.ArticleDTO;

public class ArticleValidator {

	public static List<String> validate(ArticleDTO dto){
		List<String> errors = new ArrayList<>();
		
		if(dto == null) {
			errors.add("Veuillez renseigner le code de l'article");
			errors.add("Veuillez renseigner le code de l'article");
			errors.add("Veuillez renseigner le prix unitaire de l'article");
			errors.add("Veuillez renseigner le taux TVA de l'article");
			errors.add("Veuillez renseigner le prix Unitaire Ttc de l'article");
			errors.add("Veuillez selectionner une category");
			return errors;
		}
		
		if(StringUtils.hasLength(dto.getCodeArticle())) {
			errors.add("Veuillez renseigner le code de l'article");
		}
		
		if(StringUtils.hasLength(dto.getDesignation())) {
			errors.add("Veuillez renseigner le code de l'article");
		}
		
		if(dto.getPrixUnitaireHt()== null) {
			errors.add("Veuillez renseigner le prix unitaire de l'article");
		}
		
		if(dto.getTauxTva()== null) {
			errors.add("Veuillez renseigner le taux TVA de l'article");
		}
		
		if(dto.getPrixUnitaireTtc() == null) {
			errors.add("Veuillez renseigner le prix Unitaire Ttc de l'article");
		}
		
		if(dto.getCategory() == null) {
			errors.add("Veuillez selectionner une category");
		}
		
		return errors;
	}
}
