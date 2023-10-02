package com.dev.app.api.v1.barCode.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.app.api.v1.barCode.domain.BarCode;
import com.dev.app.api.v1.barCode.domain.BarCodeRepository;

/**
 * BarCodeJPARepository
 */
public interface BarCodeJPARepository extends JpaRepository<BarCode, Integer>, BarCodeRepository{
}
