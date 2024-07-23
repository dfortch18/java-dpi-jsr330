package com.dfortch;

import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class HelloWorldClient {
    
    private final Iterable<HelloWorldPrinter> printers;

    @Inject
    public HelloWorldClient(@Any Instance<HelloWorldPrinter> printers) {
        this.printers = printers;
    }

    public void printMessage() {
        for (HelloWorldPrinter printer : printers) {
            printer.print();
        }
    }
}
