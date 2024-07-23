package com.dfortch;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

    public static void main(String[] args) {
        Weld weld = new Weld();

        try (WeldContainer container = weld.initialize()) {
            HelloWorldClient client = container.select(HelloWorldClient.class).get();
            client.printMessage();
        }
    }
}