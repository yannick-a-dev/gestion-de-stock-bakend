package com.gestionstockbackend.gestionstockbackend.models;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity{

	@ManyToOne
	@JoinColumn(name = "idvente")
	private Ventes ventes;
	
	@Column(name = "quantite")
	private BigDecimal quantite;
	
	@Column(name = "prixunitaire")
	private BigDecimal prixUnitaire;
}
