package org.sergei.listing_11_20;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import org.junit.Test;
import org.sergei.chapter11.listing_11_20.Price;
import org.sergei.chapter11.listing_11_20.Ticket;

public class TicketTest {

  @Test
  public void tenPercentDiscount() {
    Price price = mock(Price.class);
    when(price.getInitialPrice()).thenReturn(new BigDecimal("10"));

    Ticket ticket = new Ticket(price, new BigDecimal("0.9"));
    assertEquals(new BigDecimal("9.0"), ticket.getDiscountPrice());

    verify(price).getInitialPrice();
  }
}