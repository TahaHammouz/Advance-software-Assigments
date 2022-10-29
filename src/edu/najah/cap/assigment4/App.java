package edu.najah.cap.assigment4;

import edu.najah.cap.assigment4.impl.CreatorImpl;
import edu.najah.cap.assigment4.impl.ValidationImpl;

import static edu.najah.cap.assigment4.ColorStore.colors;

public class App {
    public static void main(String[] args) {

        //Create colors and if its already exist print a message
        CreatorImpl create = new CreatorImpl();
        System.out.println("---------Default values from cache--------");
        System.out.println("Initial list of elements: "+colors);
        //create a new color with valid values
        System.out.println("---------Valid--------");
        create.getOrCreateColor("grey",new Color(128, 128, 128	));
        //create a new color with valid values
        System.out.println("---------Invalid--------");
        create.getOrCreateColor("pink",new Color(255,666,-1));
        System.out.println("--------Create color once again---------");
        create.getOrCreateColor("grey",new Color(128, 128, 128));
        System.out.println("-----------------");
        ColorStore cs = new ColorStore();
        ValidationImpl vl = new ValidationImpl();
        vl.isDefault("Red", new Color(255,0,0));
        vl.isDefault("grey",new Color(128, 128, 128));
      //  cs.ColorValue(new Color(128, 128, 128	), "grey");



        // cs.ColorValue("Red");
      //  cs.ColorValue("grey");













    }
}
