package com.gestionstockbackend.gestionstockbackend.services;

import java.util.List;

import com.gestionstockbackend.gestionstockbackend.dto.ArticleDTO;

public interface ArticleService {

	ArticleDTO save(ArticleDTO dto);
	
	ArticleDTO findById(Integer id);
	
	ArticleDTO findByCodeArticle(String codeArticle);
	
	List<ArticleDTO> findAll();
	
	void delete(Integer id);
}
