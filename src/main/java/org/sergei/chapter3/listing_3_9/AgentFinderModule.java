package org.sergei.chapter3.listing_3_9;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.sergei.chapter3.AgentFinder;
import org.sergei.chapter3.WebServiceAgentFinder;

/**
 * Code for listing 3_9
 */
public class AgentFinderModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(AgentFinder.class).annotatedWith(Names.named("primary")).to(
        WebServiceAgentFinder.class);
  }
}
