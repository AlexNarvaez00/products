package com.dev.app.api.v1.barCode.use_case;

import org.springframework.stereotype.Service;

import com.dev.app.api.v1.barCode.domain.BarCode;
import com.dev.app.api.v1.barCode.domain.BarCodeRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * UpdateBarCode
 */
@Transactional
@Service
@AllArgsConstructor
public class UpdateBarCode {
  
  private BarCodeRepository repo;

  public BarCode update(BarCode barcode){
    return this.repo.save(barcode);
  }
 
  
}
