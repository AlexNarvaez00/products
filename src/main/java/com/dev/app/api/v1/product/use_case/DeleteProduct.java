package com.dev.app.api.v1.product.use_case;

import org.springframework.stereotype.Service;

import com.dev.app.api.v1.product.domain.ProductRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * DeleteProduct
 */
@Transactional
@Service
@AllArgsConstructor
public class DeleteProduct {
  private ProductRepository repo;
  
  public void destroy(Long id){
    this.repo.deleteById(id);
  }

}
