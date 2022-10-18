package edu.najah.cap.solid.ocp.operation;

import java.util.ArrayList;

public class Min implements Calculate{
    @Override
    public double calculate(ArrayList<Integer> numbers) {
        int min = Integer.MAX_VALUE;
           for (Integer number : numbers) {
                if (min > number){
                    min = number;
                }
                            }
            return min;
    }
}
