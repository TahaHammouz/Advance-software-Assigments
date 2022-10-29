package edu.najah.cap.assigment4.impl;

import edu.najah.cap.assigment4.Color;
import edu.najah.cap.assigment4.ColorStore;
import edu.najah.cap.assigment4.inf.Validation;

import java.util.HashMap;

public class ValidationImpl implements Validation {
    @Override
    public boolean isValidRGB(int red, int green, int blue) {
        if (green <= 255 && green >= 0 && red <= 255 && red >= 0 && blue <= 255 && blue >= 0) {
            return true;
        }
        return false;
    }

    public final static HashMap<String, Color> myColours = new HashMap<>();
    static {
        myColours.put("Red", new Color(255,0,0));
        myColours.put("Green", new Color(0,255,0));
        myColours.put("Blue", new Color(0,0,255));
        myColours.put("White", new Color(255,255,255));
        myColours.put("Black", new Color(0,0,0));
    }

    @Override
    public void isDefault(String colorName,Color color) {
        if (ColorStore.colors.containsKey(myColours.get(colorName))){
            System.out.println(colorName);
            }
        else {
            System.out.println(String.valueOf(ColorStore.colors.get(colorName)));
            System.out.println(ColorStore.colors.get(colorName));
        }
        }
    }