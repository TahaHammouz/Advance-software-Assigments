package edu.najah.cap.solid.di;
import edu.najah.cap.solid.di.Hardware.Input_device;

public class Keyboard implements Input_device {
@Override
    public void powerOn(){
        System.out.println("Power on " + this.getClass().getName());
    }
@Override
    public void powerOff(){
        System.out.println("Power off " + this.getClass().getName());
    }

}
