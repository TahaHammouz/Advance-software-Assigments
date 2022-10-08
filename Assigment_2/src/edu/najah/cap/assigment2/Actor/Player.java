package edu.najah.cap.assigment2.Actor;

import edu.najah.cap.assigment2.EntityCreator.Entity;

public class Player extends Entity {
    public void move(){
        System.out.println("player is moving");
    };

    @Override
    public void Renderable() {
        System.out.println("rendering player");
    }
}
