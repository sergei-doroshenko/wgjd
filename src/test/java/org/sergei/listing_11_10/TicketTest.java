package org.sergei.listing_11_10;

import org.junit.Test;
import org.sergei.chapter11.listing_11_10.HttpPrice;
import org.sergei.chapter11.listing_11_10.Price;
import org.sergei.chapter11.listing_11_10.Ticket;

import java.math.BigDecimal;
import static org.junit.Assert.*;

/**
 * This test is deliberately skipped in the Maven build You can run it manually
 * from within your IDE to see it fail
 */
public class TicketTest {

  @Test
  public void tenPercentDiscount() {
    Price price = new HttpPrice();
    Ticket ticket = new Ticket(price);
    assertEquals(new BigDecimal("9.0"), ticket.getDiscountPrice());
  }
}