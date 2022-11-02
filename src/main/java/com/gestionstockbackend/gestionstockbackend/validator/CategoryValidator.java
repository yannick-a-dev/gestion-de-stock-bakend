package com.gestionstockbackend.gestionstockbackend.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.gestionstockbackend.gestionstockbackend.dto.CategoryDTO;


public class CategoryValidator {

	public static List<String> validate(CategoryDTO categoryDTO){
		List<String> errors = new ArrayList<>();
		
		if(categoryDTO == null || !StringUtils.hasLength(categoryDTO.getCode())) {
			errors.add("Veuillez renseigner le code de la categorie");
		}
		return errors;
	}
}
