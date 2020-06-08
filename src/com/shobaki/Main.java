package com.shobaki;

public class Main {

    public static void main(String[] args) {
        //You should look to use Composition before thinking about Inheritance
        // Inheritance -> is-a relationship   ---> a car is a vehicle
        // Composition -> has-a relationship  ---> a computer has a motherboard, a case, and a monitor

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}
