package com.gestionstockbackend.gestionstockbackend.services.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionstockbackend.gestionstockbackend.dto.CategoryDTO;
import com.gestionstockbackend.gestionstockbackend.exception.ErrorCodes;
import com.gestionstockbackend.gestionstockbackend.exception.InvalidEntityException;
import com.gestionstockbackend.gestionstockbackend.repository.CategoryRepository;
import com.gestionstockbackend.gestionstockbackend.services.CategoryService;
import com.gestionstockbackend.gestionstockbackend.validator.CategoryValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository categoryRepository;

	@Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository) {

		this.categoryRepository = categoryRepository;
	}
	
	@Override
	public CategoryDTO save(CategoryDTO dto) {
		List<String> errors = CategoryValidator.validate(dto);
		if(!errors.isEmpty()) {
			log.error("Category is not valid {}", dto);
			throw new InvalidEntityException("La category n'est pas valide");
		}
		return CategoryDTO.fromEntity(categoryRepository.save(CategoryDTO.toEntity(dto)));
	}
	
	@Override
	public CategoryDTO findById(Integer id) {
		if(id == null) {
			log.error("Category ID is null");
			return null;
		}
		return categoryRepository.findById(id)
				.map(CategoryDTO :: fromEntity)
				.orElseThrow(() -> new EntityNotFoundException(
						"Aucune category avec l'ID = " + id + "n'a ete trouve dans la BDD"));
	}
	
}
