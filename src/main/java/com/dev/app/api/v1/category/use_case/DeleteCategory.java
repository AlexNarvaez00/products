package com.dev.app.api.v1.category.use_case;

import org.springframework.stereotype.Service;

import com.dev.app.api.v1.category.domain.CategoryRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * DeleteCategory
 */
@Transactional
@Service
@AllArgsConstructor
public class DeleteCategory {

  private CategoryRepository repo;

  public void destroy(Long id) {
    this.repo.deleteById(id);
  }

}
