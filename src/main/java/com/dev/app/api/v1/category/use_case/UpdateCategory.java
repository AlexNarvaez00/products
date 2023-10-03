package com.dev.app.api.v1.category.use_case;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dev.app.api.v1.category.domain.Category;
import com.dev.app.api.v1.category.domain.CategoryRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * UpdateCategory
 */
@Transactional
@Service
@AllArgsConstructor
public class UpdateCategory {

  private CategoryRepository repo;

  public Category update(Category cat){
    return this.repo.save(cat);
  }

}
