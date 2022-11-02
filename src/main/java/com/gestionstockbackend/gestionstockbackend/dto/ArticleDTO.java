package com.gestionstockbackend.gestionstockbackend.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestionstockbackend.gestionstockbackend.models.Adresse;
import com.gestionstockbackend.gestionstockbackend.models.Article;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleDTO {
	
	private Integer id;

	private String codeArticle;

	private String designation;

	private BigDecimal prixUnitaireHt;

	private BigDecimal tauxTva;

	private BigDecimal prixUnitaireTtc;

	private String photo;

	@JsonIgnore
	private CategoryDTO category;
	
	
	public static ArticleDTO fromEntity(Article article) {
		if(article == null) {
			return null;
		}
		
		return ArticleDTO.builder()
				.id(article.getId())
				.codeArticle(article.getCodeArticle())
				.designation(article.getDesignation())
				.prixUnitaireHt(article.getPrixUnitaireHt())
                .tauxTva(article.getTauxTva())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
				.build();
	}
	
	public static Article toEntity(ArticleDTO articleDTO) {
		if(articleDTO == null) {
			return null;
		}
		Article article = new Article();
		article.setId(articleDTO.getId());
		article.setCodeArticle(articleDTO.getCodeArticle());
		article.setDesignation(articleDTO.getDesignation());
		article.setPrixUnitaireHt(articleDTO.getPrixUnitaireHt());
		article.setTauxTva(articleDTO.getTauxTva());
		article.setPrixUnitaireTtc(articleDTO.getPrixUnitaireTtc());
		article.setPhoto(articleDTO.getPhoto());
		
		return article;
	}

}
