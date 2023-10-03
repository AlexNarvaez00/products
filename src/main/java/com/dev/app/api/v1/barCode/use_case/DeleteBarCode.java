package com.dev.app.api.v1.barCode.use_case;

import org.springframework.stereotype.Service;

import com.dev.app.api.v1.barCode.domain.BarCode;
import com.dev.app.api.v1.barCode.domain.BarCodeRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * DeleteBarCode
 */
@Transactional
@Service
@AllArgsConstructor
public class DeleteBarCode {
  
  private BarCodeRepository repo;

  public void destroy(Long barcodeId){
    this.repo.deleteById(barcodeId);
  }
  
}
