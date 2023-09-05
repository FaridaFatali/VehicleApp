package org.example;

/**
 * Video: <a href="https://www.youtube.com/watch?v=C0lbeAWgAfo">...</a>
 * @author Farida Fatali
 * Practice for Inheritance in Java
 */

public class Main {
    public static void main(String[] args) {
        SUV fortuner = new SUV("Fortuner", false);
        fortuner.move(40, 0);
        fortuner.accelerate(20);
        // fortuner.accelerate(-60);
        System.out.println("Current Gear: " + fortuner.getCurrentGear());
        System.out.println("Current Speed: " + fortuner.getCurrentSpeed());
    }
}