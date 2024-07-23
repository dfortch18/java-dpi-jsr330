package com.dfortch;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("printerUpper")
public class HelloWorldPrinterUppercase implements HelloWorldPrinter {

    @Override
    public void print() {
        System.out.println("HELLO WORLD!");
    }
    
}
