package com.dev.app.api.v1.category.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * CategoryRepository
 */
public interface CategoryRepository {

  /**
   * @param Category category
   *                 * @return Category
   */
  public Category save(Category category);

  public Page<Category> findByCodeLikeOrDescriptionLike(
      Pageable pageable,
      String code,
      String description);

  public void deleteById(Long id);
}
