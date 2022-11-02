package com.gestionstockbackend.gestionstockbackend.models;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "vente")
public class Ventes extends AbstractEntity{

	@Column(name = "code")
	private String code;
	
	@Column(name = "datevente")
	private Instant dateVente;
	
	@Column(name = "commentaire")
	private String commentaire;
}
