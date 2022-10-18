package edu.najah.cap.solid.srp.impl;

import edu.najah.cap.solid.srp.infc.Delete_db;

public class IDeleteDb implements Delete_db {

    @Override
    public void deleteDb() {
        System.out.println("deleting");
    }
}
