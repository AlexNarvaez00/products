package com.dev.app.api.v1.category.infrastructure.controllers.request;

import com.dev.app.api.v1.category.domain.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * StoreCategoryRequest
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StoreCategoryRequest {

  private String code; // :String[10]
  private String description; //:String[40]
  private boolean activo = true; //:boolean

  
  public Category asCategory(){
    var cat = new Category();
    cat.setCode(this.code);
    cat.setDescription(this.description);
    cat.setActivo(this.activo);
    return cat;
  }

}
