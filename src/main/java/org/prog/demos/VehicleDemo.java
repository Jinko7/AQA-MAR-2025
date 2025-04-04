package org.prog.demos;


import org.prog.pass.Boat;
import org.prog.pass.Bus;
import org.prog.pass.ITransport;
import org.prog.pass.Train;

public class VehicleDemo {
    public static void main(String[] args) {

        Boat boat = new Boat();
        Bus bus = new Bus();
        Train train = new Train();

        addPassangersAndDrop(bus);
        addPassangersAndDrop(boat);
        addPassangersAndDrop(train);


    }
    public static void addPassangersAndDrop(ITransport iTransport) {
        iTransport.addPassengers();
        iTransport.dropPassengers();
        iTransport.addPassengers();
        iTransport.dropPassengers();
        iTransport.addPassengers();
        iTransport.dropPassengers();
    }
}