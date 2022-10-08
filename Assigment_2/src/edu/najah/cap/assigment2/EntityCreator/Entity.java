package edu.najah.cap.assigment2.EntityCreator;

import edu.najah.cap.assigment2.Actor.Player;
import edu.najah.cap.assigment2.Enemy.Monster;
import edu.najah.cap.assigment2.Enemy.MonsterFast;
import edu.najah.cap.assigment2.Enemy.MonsterStealth;

public class Entity {
    public void Renderable(){
        System.out.println("Rendering ...");
    }

    public static void main(String[] args) {
        Player player = new Player();
        Monster monsterFast = new MonsterFast();
        Monster monsterStealth = new MonsterStealth();
        player.Renderable();
        player.move();
        monsterFast.move();
        monsterStealth.Renderable();
        
    }
}
