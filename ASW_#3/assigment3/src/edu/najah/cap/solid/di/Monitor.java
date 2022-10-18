package edu.najah.cap.solid.di;


import edu.najah.cap.solid.di.Hardware.Display;

public class Monitor implements Display {
    public void turnOn() {
        System.out.println("Turn on " + this.getClass().getName());
    }

    public void turnOff() {
        System.out.println("Turn off " + this.getClass().getName());
    }
}
