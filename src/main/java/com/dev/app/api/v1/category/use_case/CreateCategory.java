package com.dev.app.api.v1.category.use_case;

import org.springframework.stereotype.Service;

import com.dev.app.api.v1.category.domain.Category;
import com.dev.app.api.v1.category.domain.CategoryRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * CreateCategory
 */
@Transactional
@Service
@AllArgsConstructor
public class CreateCategory {

 private CategoryRepository repo;

  public Category handelCreate(Category cat){
    return this.repo.save(cat);
  }

}
