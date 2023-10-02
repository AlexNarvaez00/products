package com.dev.app.api.v1.barCode.domain;

import com.dev.app.api.v1.product.domain.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BarCode
 */
@Entity
@Table(name = "bars_code")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BarCode {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 20)
  private String code; // String[20]
 
  private boolean active = true; // boolean
  //
  @OneToOne
  private Product product;
}
