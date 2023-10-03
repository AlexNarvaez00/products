package com.dev.app.api.v1.category.infrastructure.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.dev.app.api.v1.Routes;
import com.dev.app.api.v1.barCode.infrastructure.controllers.request.UpdateBarCodeRequest;
import com.dev.app.api.v1.barCode.use_case.UpdateBarCode;
import com.dev.app.api.v1.category.domain.Category;
import com.dev.app.api.v1.category.infrastructure.controllers.request.StoreCategoryRequest;
import com.dev.app.api.v1.category.infrastructure.controllers.request.UpdateCategoryRequest;
import com.dev.app.api.v1.category.use_case.CreateCategory;
import com.dev.app.api.v1.category.use_case.DeleteCategory;
import com.dev.app.api.v1.category.use_case.FindCategoryByCodeOrCategory;
import com.dev.app.api.v1.category.use_case.UpdateCategory;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

/**
 * CategoryController
 */
@RestController
@RequestMapping(Routes.API_CATEGORY)
@AllArgsConstructor
public class CategoryController {

  private CreateCategory createCategory;
  private UpdateCategory updateCategory;
  private DeleteCategory deleteCategory;
  private FindCategoryByCodeOrCategory findCategoryByCodeOrCategory;

  @GetMapping("")
  public Page<Category> index(
      @RequestParam(required = false, defaultValue = "0") Integer page,
      @RequestParam(required = false, defaultValue = "") String code,
      @RequestParam(required = false, defaultValue = "") String description) {
    Pageable pageable = PageRequest.of(page, 10);
    return this.findCategoryByCodeOrCategory
        .andGet(pageable, "%"+  code + "%", "%" + description + "%");
  }

  @PostMapping("")
  public Category store(@RequestBody @Valid StoreCategoryRequest req){
    return this.createCategory.handelCreate(req.asCategory());
  }

  @PutMapping("/{id}")
  public Category update(@PathVariable Long id ,@RequestBody @Valid UpdateCategoryRequest req){
    return this.updateCategory.update(req.asCategory(id));
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id){
    this.deleteCategory.destroy(id);
  }

}
