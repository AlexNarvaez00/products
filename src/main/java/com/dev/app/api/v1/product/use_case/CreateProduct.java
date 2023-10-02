package com.dev.app.api.v1.product.use_case;

import org.springframework.stereotype.Service;

import com.dev.app.api.v1.product.domain.Product;
import com.dev.app.api.v1.product.domain.ProductRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * CreateProduct
 */
@Transactional
@Service
@AllArgsConstructor
public class CreateProduct {

  private ProductRepository repo;

  public Product handelCreate(Product product){
    return repo.save(product);
  }
}
