package com.gestionstockbackend.gestionstockbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstockbackend.gestionstockbackend.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
