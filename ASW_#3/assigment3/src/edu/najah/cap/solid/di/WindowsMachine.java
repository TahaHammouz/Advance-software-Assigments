package edu.najah.cap.solid.di;

public class WindowsMachine {
    public final Keyboard keyboard;
    public final Monitor monitor;

    public WindowsMachine(Keyboard keyboard, Monitor monitor){
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
    public void changeKeyboardStatus(boolean status){
        if (status){
            keyboard.powerOn();
        } else {
            keyboard.powerOff();
        }
    }

    public void changeMonitorStatus(boolean status){
        if (status){
            monitor.turnOn();
        } else {
            monitor.turnOff();
        }
    }




}
