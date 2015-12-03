package org.sergei;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Example of guice dependency injection.
 *
 */
public class App {
    public static void main( String[] args ) {
        Injector injector = Guice.createInjector(new MessengerModule());
        MessageService service = injector.getInstance(MessageService.class);
        System.out.println(service.getMessage());
    }
}
