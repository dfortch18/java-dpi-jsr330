package com.dfortch;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("printerCap")
public class HelloWorldPrinterCapitalize implements HelloWorldPrinter {

    @Override
    public void print() {
        System.out.println("Hello World!");
    }
    
}
