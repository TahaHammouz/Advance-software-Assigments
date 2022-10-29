package edu.najah.cap.assigment4;
import java.util.HashMap;
import edu.najah.cap.assigment4.impl.ValidationImpl;

public class ColorStore {
    public final static HashMap<String, Color> colors = new HashMap<>();
    static {
        colors.put("Red", new Color(255,0,0));
        colors.put("Green", new Color(0,255,0));
        colors.put("Blue", new Color(0,0,255));
        colors.put("White", new Color(255,255,255));
        colors.put("Black", new Color(0,0,0));
    }

}