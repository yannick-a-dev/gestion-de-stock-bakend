package com.gestionstockbackend.gestionstockbackend.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestionstockbackend.gestionstockbackend.models.Category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDTO {
	
	private Integer id;

	private String code;

	private String designation;

	@JsonIgnore
	private List<ArticleDTO> articles;
	
	public static CategoryDTO fromEntity(Category category) {
		if(category == null) {
			return null;
			// TODO
		}
		
		return CategoryDTO.builder()
				.id(category.getId())
				.code(category.getCode())
				.designation(category.getDesignation())
				.build();
	}
	
	public static Category toEntity(CategoryDTO categoryDTO) {
		if(categoryDTO == null) {
			return null;
		    //TODO
		}
		
		Category category = new Category();
		category.setId(categoryDTO.getId());
		category.setCode(categoryDTO.getCode());
		category.setDesignation(categoryDTO.getDesignation());
		
		return category;
	}
}
