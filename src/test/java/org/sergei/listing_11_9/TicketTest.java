package org.sergei.listing_11_9;

import java.math.BigDecimal;
import org.junit.Test;
import org.sergei.chapter11.listing_11_9.Ticket;

import static org.junit.Assert.*;

public class TicketTest {

  @Test
  public void tenPercentDiscount() {
    String dummyName = "Riley";
    Ticket ticket = new Ticket(dummyName, new BigDecimal("10"));
    assertEquals(new BigDecimal("9.0"), ticket.getDiscountPrice());
  }

}