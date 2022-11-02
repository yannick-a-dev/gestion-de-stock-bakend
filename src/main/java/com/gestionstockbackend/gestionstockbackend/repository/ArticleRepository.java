package com.gestionstockbackend.gestionstockbackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstockbackend.gestionstockbackend.models.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

   Optional<Article>  findArticleByCodeArticle(String codeArticle);
}
