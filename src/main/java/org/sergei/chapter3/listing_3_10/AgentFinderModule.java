package org.sergei.chapter3.listing_3_10;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.sergei.chapter3.AgentFinder;
import org.sergei.chapter3.SpreadsheetAgentFinder;

/**
 * Code for listing 3_10
 */
public class AgentFinderModule extends AbstractModule {

  @Override
  protected void configure() {
  }

  @Provides
  AgentFinder provideAgentFinder() {
    SpreadsheetAgentFinder finder = new SpreadsheetAgentFinder();
    finder.setType("Excel 97");
    finder.setPath("c:/temp/agents.xls");
    return finder;
  }
}