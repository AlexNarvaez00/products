package com.dev.app.api.v1.category.use_case;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dev.app.api.v1.category.domain.Category;
import com.dev.app.api.v1.category.domain.CategoryRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * FindCategoryByCodeOrCategory
 */
@Transactional
@Service
@AllArgsConstructor
public class FindCategoryByCodeOrCategory {
 private CategoryRepository repo; 


  public Page<Category> andGet(Pageable pageable, String code, String description) {
    return this.repo.findByCodeLikeOrDescriptionLike(pageable, code, description);
  }


}
