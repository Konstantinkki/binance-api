package com.example.binance.service;

import com.example.binance.entity.Code;
import com.example.binance.repository.CodeRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CodeService {
  private final CodeRepository codeRepository;

  public Code save(String codeName) {
    Code code = new Code();
    code.setName(codeName);
    return codeRepository.save(code);
  }

  public Code get(String codeName) {
    return codeRepository.getByName(codeName).orElse(save(codeName));
  }


}
