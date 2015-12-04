package org.sergei.message_app;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.sergei.message_app.messenger.JSONMessenger;
import org.sergei.message_app.messenger.Messenger;
import org.sergei.message_app.messenger.XMLMessenger;

/**
 * Created by sergei on 12/3/15.
 */
public class MessengerModule extends AbstractModule {
    @Override
    protected void configure() {
        // simple variant
        // bind(Messenger.class).to(XMLMessenger.class);
        // named variant
        bind(Messenger.class).annotatedWith(Names.named("xml")).to(XMLMessenger.class);
        bind(Messenger.class).annotatedWith(Names.named("json")).to(JSONMessenger.class);
    }
}
