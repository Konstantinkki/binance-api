package com.example.binance.service;

import com.example.binance.entity.Code;
import com.example.binance.entity.Price;
import com.example.binance.repository.PriceRepository;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PriceService {

  private final PriceRepository priceRepository;

  public Optional<Price> getPrice(Code code){
    return priceRepository.findFirstByCodeOrderByTimeDesc(code);
  }

  public void clear(LocalDateTime upTo){
    List<Price> toDelete = this.priceRepository.findAllByTimeLessThan(upTo);
    toDelete.forEach(this.priceRepository::delete);

  }

  public  Price  save (Code code, BigInteger priceVal, LocalDateTime time){
    Price price = new Price();
    price.setCode(code);
    price.setVal(priceVal);
    price.setTime(time);
    return priceRepository.save(price);

  }

}
