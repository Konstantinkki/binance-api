package com.example.binance.job;

import com.example.binance.service.PriceService;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
@EnableScheduling
public class ClearOldRecords {

  private final PriceService priceService;

  @Scheduled(fixedRate = 60000)
  private void clear24after(){
    priceService.clear(LocalDateTime.now().minusHours(24));
  }

}
