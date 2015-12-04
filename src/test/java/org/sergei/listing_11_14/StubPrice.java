package org.sergei.listing_11_14;

import org.sergei.chapter11.listing_11_14.Price;

import java.math.BigDecimal;

public class StubPrice implements Price {

  @Override
  public BigDecimal getInitialPrice() {
    return new BigDecimal("10");
  }
}