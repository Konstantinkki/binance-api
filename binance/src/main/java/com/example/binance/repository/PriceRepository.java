package com.example.binance.repository;

import com.example.binance.entity.Code;
import com.example.binance.entity.Price;
import com.example.binance.entity.PriceId;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, PriceId> {
  List<Price> findAllByTimeLessThan(LocalDateTime time);

  Optional<Price> findFirstByCodeOrderByTimeDesc(Code code);
}
