package com.gestionstockbackend.gestionstockbackend.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.gestionstockbackend.gestionstockbackend.models.TypeMvtStk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvtStkDTO {
	
	private Integer id;

	private Instant dateMvt;

	private BigDecimal quantite;

	private ArticleDTO article;

	private TypeMvtStk typeMvt;
}
