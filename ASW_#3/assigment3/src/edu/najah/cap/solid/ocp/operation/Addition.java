package edu.najah.cap.solid.ocp.operation;

import edu.najah.cap.solid.ocp.Operation;

import java.util.ArrayList;

public class Addition implements Calculate {
    @Override
    public double calculate(ArrayList<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }
}