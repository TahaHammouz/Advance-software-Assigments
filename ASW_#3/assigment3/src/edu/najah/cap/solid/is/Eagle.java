package edu.najah.cap.solid.is;

import edu.najah.cap.solid.is.Abilities.Flyable;
import edu.najah.cap.solid.is.Abilities.Molt;
import edu.najah.cap.solid.is.Abilities.Swimable;

public class Eagle implements Flyable, Molt, Swimable {

    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    @Override
    public void molt() {

        this.numberOfFeathers -= 1;
    }

    @Override
    public void swim() {
        System.err.println("Unsupported Operation Exception");
        throw new UnsupportedOperationException();
    }

}
