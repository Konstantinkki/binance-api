package com.example.binance.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@IdClass(PriceId.class)
@Getter
@Setter
@NoArgsConstructor
@Table(name="prices")
public class Price {
  @Id
  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name="code_id", referencedColumnName = "id", foreignKey = @ForeignKey(name="code_key"))
  private Code code;
  @Id
  @Column(name = "time")
  private LocalDateTime time;

  @Column(name = "val")
  private BigInteger val;


}
