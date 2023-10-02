package com.dev.app.api.v1.category.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.app.api.v1.category.domain.Category;
import com.dev.app.api.v1.category.domain.CategoryRepository;

/**
 * CategoryJPARepository
 */
public interface CategoryJPARepository extends JpaRepository<Category, Integer>, CategoryRepository{
}
