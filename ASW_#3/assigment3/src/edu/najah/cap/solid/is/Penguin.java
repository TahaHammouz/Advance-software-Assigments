package edu.najah.cap.solid.is;

import edu.najah.cap.solid.is.Abilities.Flyable;
import edu.najah.cap.solid.is.Abilities.Molt;
import edu.najah.cap.solid.is.Abilities.Swimable;

public class Penguin implements Flyable, Molt, Swimable {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void fly() {
        System.err.println("Unsupported Operation Exception");
        throw new UnsupportedOperationException();
    }

    public void swim() {

        this.currentLocation = "in the water";
    }
}
