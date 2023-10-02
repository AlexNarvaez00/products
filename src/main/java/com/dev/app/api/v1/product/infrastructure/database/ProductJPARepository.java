package com.dev.app.api.v1.product.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.app.api.v1.product.domain.Product;
import com.dev.app.api.v1.product.domain.ProductRepository;

/**
 * ProductJPARepository
 */
public interface ProductJPARepository extends JpaRepository<Product, Integer>, ProductRepository{
}
