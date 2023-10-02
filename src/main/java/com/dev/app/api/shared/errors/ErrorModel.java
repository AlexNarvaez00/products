package com.dev.app.api.shared.errors;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * ErrorModel
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorModel {
  /**
   *
   * Causa "Pattern", "Min", "Max" ....
   *
   */
  private String code;
  /**
   *
   * Descripcion del problema
   *
   */
  private String detail;
}
