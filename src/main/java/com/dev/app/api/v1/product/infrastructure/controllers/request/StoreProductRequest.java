package com.dev.app.api.v1.product.infrastructure.controllers.request;

import com.dev.app.api.v1.category.domain.Category;
import com.dev.app.api.v1.product.domain.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * SotreProductRequest
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StoreProductRequest {

  private String code; // :String[20]
  private String description; // :String[60]
  private Category category; // Categoria
  private boolean active; // boolean

  public Product asProduct() {
    return Product.builder()
        .code(this.code)
        .description(this.description)
        .category(this.category)
        .active(this.active)
        .build();
  }

}
