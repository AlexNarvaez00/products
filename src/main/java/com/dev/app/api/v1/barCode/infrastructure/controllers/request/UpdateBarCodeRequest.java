package com.dev.app.api.v1.barCode.infrastructure.controllers.request;

import com.dev.app.api.v1.barCode.domain.BarCode;
import com.dev.app.api.v1.product.domain.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UpdateBarCodeRequest
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBarCodeRequest {

  @NotNull
  @NotBlank
  @Size(min = 0, max = 20)
  private String code;

  @NotNull
  private Product product;

  @NotNull
  private boolean active = true; // boolean

  public BarCode asBarCode(Long id) {
    return BarCode.builder()
        .id(id)
        .code(this.code)
        .product(this.product)
        .active(this.active)
        .build();
  }

}
