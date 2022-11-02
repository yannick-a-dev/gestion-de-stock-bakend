package com.gestionstockbackend.gestionstockbackend.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.gestionstockbackend.gestionstockbackend.dto.ArticleDTO;
import com.gestionstockbackend.gestionstockbackend.dto.CategoryDTO;
import com.gestionstockbackend.gestionstockbackend.exception.ErrorCodes;
import com.gestionstockbackend.gestionstockbackend.exception.InvalidEntityException;
import com.gestionstockbackend.gestionstockbackend.models.Article;
import com.gestionstockbackend.gestionstockbackend.repository.ArticleRepository;
import com.gestionstockbackend.gestionstockbackend.services.ArticleService;
import com.gestionstockbackend.gestionstockbackend.validator.ArticleValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

	private ArticleRepository articleRepository;

	@Autowired
	public ArticleServiceImpl(ArticleRepository articleRepository) {
		super();
		this.articleRepository = articleRepository;
	}

	@Override
	public ArticleDTO save(ArticleDTO dto) {
		List<String> errors = ArticleValidator.validate(dto);
		if (!errors.isEmpty()) {
			log.error("Article is not valid{}", dto);
			throw new InvalidEntityException("L'article n'est pas valide", ErrorCodes.ARTICLE_NOT_VALID, errors);
		}

        return ArticleDTO.fromEntity(
        		articleRepository.save(ArticleDTO.toEntity(dto))
        		);
	
	}

	@Override
	public ArticleDTO findById(Integer id) {
		if (id == null) {
			log.error("Article ID is null");
			return null;
		}
		Optional<Article> article = articleRepository.findById(id);

		ArticleDTO dto = ArticleDTO.fromEntity(article.get());

		return Optional.of(dto).orElseThrow(
				() -> new EntityNotFoundException("Aucun article avec l'ID = " + id + "n'a ete trouve dans la BDD"));
	}

	@Override
	public ArticleDTO findByCodeArticle(String codeArticle) {
		if (StringUtils.hasLength(codeArticle)) {
			log.error("Article CODE is null");
			return null;
		}
		Optional<Article> article = articleRepository.findArticleByCodeArticle(codeArticle);

		ArticleDTO dto = ArticleDTO.fromEntity(article.get());

		return Optional.of(dto).orElseThrow(
				() -> new EntityNotFoundException("Aucun article avec le CODE = " + codeArticle + "n'a ete trouve dans la BDD"));
	}

	@Override
	public List<ArticleDTO> findAll() {
		return articleRepository.findAll().stream()
				.map(ArticleDTO::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		if (id == null) {
			log.error("Article ID is null");
			return;
		}	
    articleRepository.deleteById(id);
	}

}
