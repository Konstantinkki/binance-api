package com.example.binance.repository;

import com.example.binance.entity.Code;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeRepository extends JpaRepository<Code, Long> {
  Optional<Code> getByName(String name);
}
