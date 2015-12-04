package org.sergei.listing_11_14;

import org.junit.Test;
import org.sergei.chapter11.listing_11_14.Price;
import org.sergei.chapter11.listing_11_14.Ticket;

import java.math.BigDecimal;
import static org.junit.Assert.*;

public class TicketTest {

  @Test
  public void tenPercentDiscount() {
    Price price = new StubPrice();
    Ticket ticket = new Ticket(price);
    assertEquals(new BigDecimal("9.0"), ticket.getDiscountPrice());
  }
}