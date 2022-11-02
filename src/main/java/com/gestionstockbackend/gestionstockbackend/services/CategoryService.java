package com.gestionstockbackend.gestionstockbackend.services;

import com.gestionstockbackend.gestionstockbackend.dto.CategoryDTO;

public interface CategoryService {

	CategoryDTO save(CategoryDTO dto);

	CategoryDTO findById(Integer id);

}
