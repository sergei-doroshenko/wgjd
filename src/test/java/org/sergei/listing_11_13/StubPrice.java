package org.sergei.listing_11_13;

import org.sergei.chapter11.listing_11_13.Price;

import java.math.BigDecimal;

public class StubPrice implements Price {

  @Override
  public BigDecimal getInitialPrice() {
    return new BigDecimal("10");
  }
}