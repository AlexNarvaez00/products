package com.dev.app.api.v1.product.infrastructure.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.app.api.v1.Routes;
import com.dev.app.api.v1.product.domain.Product;
import com.dev.app.api.v1.product.infrastructure.controllers.request.StoreProductRequest;
import com.dev.app.api.v1.product.use_case.CreateProduct;
import com.dev.app.api.v1.product.use_case.FindByCodeAndDescription;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

/**
 * ProductController
 */
@RestController
@RequestMapping(Routes.API_PRODUCT)
@AllArgsConstructor
public class ProductController {

  private CreateProduct createProduct;
  private FindByCodeAndDescription findCodeAndDescription;

  @GetMapping("")
  public Page<Product> index(
      @RequestParam(required = false, defaultValue = "0") Integer page,
      @RequestParam(required = false, defaultValue = "") String code,
      @RequestParam(required = false, defaultValue = "") String description) {
    Pageable pageable = PageRequest.of(page, 10);
    return this.findCodeAndDescription
        .andGet(pageable, "%" + code + "%", "%"+ description + "%");
  }

  @PostMapping
  public Product store(
      @RequestBody @Valid StoreProductRequest req) {
    return this.createProduct.handelCreate(req.asProduct());
  }

  @PutMapping("/{id}")
  public Product update(
      @PathVariable Long id,
      @RequestBody @Valid StoreProductRequest req) {
    Product pro = req.asProduct();
    pro.setId(id);
    return this.createProduct.handelCreate(req.asProduct());
  }

}
