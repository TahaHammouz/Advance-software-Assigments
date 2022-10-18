package edu.najah.cap.solid.ocp.operation;

import java.util.ArrayList;

public class Count implements Calculate{
    @Override
    public double calculate(ArrayList<Integer> numbers) {
        return numbers.size();

    }
}
