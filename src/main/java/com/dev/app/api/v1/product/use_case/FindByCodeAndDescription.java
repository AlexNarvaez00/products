package com.dev.app.api.v1.product.use_case;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dev.app.api.v1.product.domain.Product;
import com.dev.app.api.v1.product.domain.ProductRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * FindByCodeAndDescription
 */
@Transactional
@Service
@AllArgsConstructor
public class FindByCodeAndDescription {

  private ProductRepository repo;

  public Page<Product> andGet(Pageable pageable, String code, String description) {
    return this.repo.findByCodeAndDescriptionLike(pageable, code, description);
  }

}
