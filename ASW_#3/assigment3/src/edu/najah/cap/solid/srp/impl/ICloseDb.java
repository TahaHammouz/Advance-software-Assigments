package edu.najah.cap.solid.srp.impl;

import edu.najah.cap.solid.srp.infc.CloseDb;

public class ICloseDb implements CloseDb {
    @Override
    public void CloseDb() {
        System.out.println("closing");
    }
}
