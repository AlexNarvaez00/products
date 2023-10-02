package com.dev.app.api.v1.product.domain;

import java.util.List;

import com.dev.app.api.v1.barCode.domain.BarCode;
import com.dev.app.api.v1.category.domain.Category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Product
 */
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 20)
  private String code; // :String[20]

  @Column(length = 60)
  private String description; // :String[60]

  @OneToOne
  private Category category; //Categoria

  @OneToMany( mappedBy = "product" )
  private List<BarCode> BarsCode; // CodigoBarra[]

  private boolean active; //boolean
}
