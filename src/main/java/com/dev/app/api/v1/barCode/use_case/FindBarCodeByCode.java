package com.dev.app.api.v1.barCode.use_case;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dev.app.api.v1.barCode.domain.BarCode;
import com.dev.app.api.v1.barCode.domain.BarCodeRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * FindBarCodeByCode
 */
@Transactional
@Service
@AllArgsConstructor
public class FindBarCodeByCode {

  private BarCodeRepository repo;

  /**
   * 
   * @param pageable
   * @param code
   * @return Page<BarCode>
   */
  public Page<BarCode> andGet(Pageable pageable, String code) {
    return this.repo.findByCodeLike(pageable, code);
  }
}
