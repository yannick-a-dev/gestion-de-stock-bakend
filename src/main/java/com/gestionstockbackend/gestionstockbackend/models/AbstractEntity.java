package com.gestionstockbackend.gestionstockbackend.models;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)// pour creation et lastModifiedDate
public class AbstractEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@CreatedDate
	@Column(name = "creationDate", nullable = false)
	@JsonIgnore
	private Instant creationDate;
	
	@LastModifiedDate
	@Column(name = "lastModifiedDate")
	@JsonIgnore
	private Instant lastUpdateDate;
}
