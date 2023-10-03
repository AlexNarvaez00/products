package com.dev.app.api.v1.category.infrastructure.controllers.request;

import com.dev.app.api.v1.category.domain.Category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UpdateCategoryRequest
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateCategoryRequest {

  @NotBlank
  @NotNull
  @Size(min = 0, max = 10)
  private String code; // :String[10]

  @NotBlank
  @NotNull
  @Size(min = 0, max = 40)
  private String description; // :String[40]

  @NotNull
  private boolean active = true; // :boolean

  public Category asCategory(Long id) {
    return Category
        .builder()
        .id(id)
        .code(this.code)
        .description(this.description)
        .active(this.active)
        .build();
  }

}
