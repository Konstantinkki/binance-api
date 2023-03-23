package com.example.binance.provider;

import java.math.BigDecimal;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class SettingsProvider {
  @Value("${binance.api.key}")
  private String apiKey;
  @Value("${binance.api.secret}")
  private String secretKey;

  @Value("${binance.multiply}")
  private BigDecimal multiply;
}
