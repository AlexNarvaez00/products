package com.dev.app.api.v1.barCode.infrastructure.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.dev.app.api.v1.Routes;
import com.dev.app.api.v1.barCode.domain.BarCode;
import com.dev.app.api.v1.barCode.infrastructure.controllers.request.StoreBarCodeRequest;
import com.dev.app.api.v1.barCode.infrastructure.controllers.request.UpdateBarCodeRequest;
import com.dev.app.api.v1.barCode.use_case.CreateBarCode;
import com.dev.app.api.v1.barCode.use_case.DeleteBarCode;
import com.dev.app.api.v1.barCode.use_case.FindBarCodeByCode;
import com.dev.app.api.v1.barCode.use_case.UpdateBarCode;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

/**
 * BarCodeController
 */
@RestController
@RequestMapping(Routes.API_BARS_CODE)
@AllArgsConstructor
public class BarCodeController {

  private CreateBarCode createBarCode;
  private UpdateBarCode updateBarCode;
  private DeleteBarCode deleteBarCode;
  private FindBarCodeByCode findBarCodeByCode;

  @GetMapping("")
  public Page<BarCode> index(
    @RequestParam(required = false, defaultValue = "") String code,
    @RequestParam(required = false, defaultValue = "0") int page
  ){
    Pageable pageable = PageRequest.of(page, 10);
    return this.findBarCodeByCode.andGet(pageable, "%"+code+"%");
  }

  @PostMapping("")
  public BarCode store(@RequestBody @Valid StoreBarCodeRequest req){
    return this.createBarCode.handleCreate(req.asBarCode());
  }

  @PutMapping("{id}")
  public BarCode update(@PathVariable Long id ,@RequestBody @Valid UpdateBarCodeRequest req){
    return this.updateBarCode.update(req.asBarCode(id)); 
  }
  
  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id){
    this.deleteBarCode.destroy(id);
  }

}
