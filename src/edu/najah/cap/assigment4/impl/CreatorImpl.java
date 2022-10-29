package edu.najah.cap.assigment4.impl;

import edu.najah.cap.assigment4.Color;
import edu.najah.cap.assigment4.ColorStore;
import edu.najah.cap.assigment4.inf.Creator;

public class CreatorImpl implements Creator {
    @Override
    public void getOrCreateColor(String colorName, Color color) {
        if (!ColorStore.colors.containsKey(colorName)){
            ColorStore.colors.put(colorName,color);
            System.out.println("The Color: "+colorName+" Has been created");
        }else{
            System.out.println("The "+colorName+" is already created");
        }
    }
}