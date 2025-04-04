package org.prog.pass;

public class Boat implements ITransport{

    @Override
    public void addPassengers() {
        System.out.println("Boat add passenger");
    }

    @Override
    public void dropPassengers() {
        System.out.println("Boat drop passenger");
    }
}