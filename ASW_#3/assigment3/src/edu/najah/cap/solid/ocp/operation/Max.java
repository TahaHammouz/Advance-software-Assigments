package edu.najah.cap.solid.ocp.operation;

import java.util.ArrayList;

public class Max implements Calculate{
    @Override
    public double calculate(ArrayList<Integer> numbers) {
                    int max = Integer.MIN_VALUE;
            for (Integer number : numbers) {
                if (max < number){
                    max = number;
                }
            }
            return max;
    }
}
