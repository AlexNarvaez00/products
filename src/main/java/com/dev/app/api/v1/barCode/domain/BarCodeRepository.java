package com.dev.app.api.v1.barCode.domain;

/**
 * BarCodeRepository
 */
public interface BarCodeRepository {
  /**
   * @param BarCode code
   * @return BarCode
   */
  public BarCode save(BarCode code);

}
