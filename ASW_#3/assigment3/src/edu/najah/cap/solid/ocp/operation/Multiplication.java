package edu.najah.cap.solid.ocp.operation;

import java.util.ArrayList;

public class Multiplication implements Calculate{
    @Override
    public double calculate(ArrayList<Integer> numbers) {
        int result = 1;
        for (Integer number : numbers) {
            result *= number;
        }
        return result;
    }

}
