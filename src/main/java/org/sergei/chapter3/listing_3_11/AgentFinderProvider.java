package org.sergei.chapter3.listing_3_11;

import org.sergei.chapter3.AgentFinder;
import org.sergei.chapter3.SpreadsheetAgentFinder;

import javax.inject.Provider;

/**
 * Code for listing 3_11
 */
public class AgentFinderProvider implements Provider<AgentFinder> {

  @Override
  public AgentFinder get() {
    SpreadsheetAgentFinder finder = new SpreadsheetAgentFinder();
    finder.setType("Excel 97");
    finder.setPath("C:/temp/agents.xls");
    return finder;
  }
}
