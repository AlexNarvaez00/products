package com.dev.app.api.v1.barCode.use_case;

import org.springframework.stereotype.Service;

import com.dev.app.api.v1.barCode.domain.BarCode;
import com.dev.app.api.v1.barCode.domain.BarCodeRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * CreateBarCode
 */
@Transactional
@Service
@AllArgsConstructor
public class CreateBarCode {

  private BarCodeRepository repo;

  public BarCode handelCreate(BarCode barCode){
    return repo.save(barCode);
  }
}
