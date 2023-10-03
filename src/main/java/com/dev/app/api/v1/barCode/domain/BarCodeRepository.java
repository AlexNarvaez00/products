package com.dev.app.api.v1.barCode.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * BarCodeRepository
 */
public interface BarCodeRepository {
  /**
   * @param BarCode code
   * @return BarCode
   */
  public BarCode save(BarCode code);

  /**
   * @param pageable
   * @param code
   * @return
   */
  public Page<BarCode> findByCodeLike(Pageable pageable, String code);

  public void deleteById(Long id);
}
