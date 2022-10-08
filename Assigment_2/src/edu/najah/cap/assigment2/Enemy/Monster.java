package edu.najah.cap.assigment2.Enemy;

import edu.najah.cap.assigment2.EntityCreator.Entity;

public class Monster extends Entity {
    public void move(){
        System.out.println("monster is moving");
    };
    public void makeNoise(){
        System.out.println("monster is making a noise");
    };

    @Override
    public void Renderable() {
        System.out.println("rendering a monster");
    }
}
