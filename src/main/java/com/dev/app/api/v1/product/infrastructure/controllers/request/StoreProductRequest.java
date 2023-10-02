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
  private Long category_id; // Categoria
  private boolean active; // boolean

  public Product asProduct() {
    var cat = new Category();
    cat.setId(this.category_id);
    return Product.builder()
        .code(this.code)
        .description(this.description)
        .category(cat)
        .active(this.active)
        .build();
  }

}
