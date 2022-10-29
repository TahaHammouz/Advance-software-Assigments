package edu.najah.cap.assigment4;

import edu.najah.cap.assigment4.impl.ValidationImpl;

import java.util.HashMap;

public final class Color {
     ValidationImpl valid = new ValidationImpl();

    private int red;
    private int green;
    private int blue;
   public Color(int red, int green, int blue) {
       if (valid.isValidRGB(red,green,blue)){
           this.red = red;
           this.green = green;
           this.blue = blue;
       }
       else{
           System.out.println("Invalid RGB values");
       }
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }
    public void setGreen(int green) {
        this.green = green;
    }
    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }
    public int getBlue() {
        return blue;
    }
    @Override
    public String toString(){
       return this.red + ", " + this.green + " ," + this.blue;
    }

}
