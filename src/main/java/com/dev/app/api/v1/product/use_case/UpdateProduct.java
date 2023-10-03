package com.dev.app.api.v1.product.use_case;

import org.springframework.stereotype.Service;

import com.dev.app.api.v1.product.domain.Product;
import com.dev.app.api.v1.product.domain.ProductRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * UpdateProduct
 */
@Transactional
@Service
@AllArgsConstructor
public class UpdateProduct {

  private ProductRepository repo;
 
  public Product update(Product prod){
    return this.repo.save(prod);
  }
 
}
