package com.dev.app.api.v1.product.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * ProductRepository
 */
public interface ProductRepository {

  /**
   * @param Product product
   * @return Product
   */
  public Product save(Product product);


  public Page<Product> findByCodeOrDescriptionLike(Pageable page, String code, String description);

  public void deleteById(Long id);

}
