package com.dev.app.api.v1.product.infrastructure.controllers.request;

import com.dev.app.api.v1.category.domain.Category;
import com.dev.app.api.v1.product.domain.Product;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UpdateProductRequest
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateProductRequest {

  @NotNull
  @NotEmpty
  @Size(min = 0, max = 20)
  private String code; // :String[20]

  @NotNull
  @Size(min = 0, max = 60)
  private String description; // :String[60]

  @NotNull
  private Category category; // Categoria

  @NotNull
  private boolean active; // boolean

  /**
   * 
   * @return Product
   */
  public Product asProduct(Long id) {
    return Product.builder()
        .id(id)
        .code(this.code)
        .description(this.description)
        .category(this.category)
        .active(this.active)
        .build();
  }

}
