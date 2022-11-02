package com.gestionstockbackend.gestionstockbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.gestionstockbackend.gestionstockbackend.dto.ArticleDTO;
import com.gestionstockbackend.gestionstockbackend.services.ArticleService;

@RestController
public class ArticleController implements ArticleApi{
	
	private ArticleService articleService;
	
    @Autowired
	public ArticleController(ArticleService articleService) {

		this.articleService = articleService;
	}

	@Override
	public ArticleDTO save(ArticleDTO dto) {
		return articleService.save(dto);
	}

	@Override
	public ArticleDTO findById(Integer id) {
		return articleService.findById(id);
	}

	@Override
	public ArticleDTO findByCodeArticle(String codeArticle) {
		return articleService.findByCodeArticle(codeArticle);
	}

	@Override
	public List<ArticleDTO> findAll() {
		return articleService.findAll();
	}

	@Override
	public void delete(Integer id) {
	
		articleService.delete(id);
	}

}
