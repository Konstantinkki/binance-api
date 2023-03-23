package com.example.binance.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="codes", uniqueConstraints = {
    @UniqueConstraint(name = "name_unique", columnNames = "name")
})
public class Code {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id")
  private Long id;

  @Column(name="name")
  private String name;
  @OneToMany(mappedBy = "code", fetch = FetchType.LAZY)
  private List<Price> prices;
}
