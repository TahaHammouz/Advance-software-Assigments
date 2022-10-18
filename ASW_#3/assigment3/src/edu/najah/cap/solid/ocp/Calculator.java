package edu.najah.cap.solid.ocp;


import edu.najah.cap.solid.ocp.operation.*;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> numbers = null;
    public Calculator(){
        numbers = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
    public void addNumber(int number){
        numbers.add(number);
    }

    public void removeNumberAtIndex(int index){
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }


    public double getOperationResult(Operation operation) {  //this

        double result = 0;
        switch (operation) {

            case Addition:
                Addition addition = new Addition();
                result = addition.calculate(numbers);
                break;

            case Multiplication:
                Multiplication multi = new Multiplication();
                result = multi.calculate(numbers);
                break;
            case Max:
                Max max = new Max();
                max.calculate(numbers);
            case Min:
                Min min = new Min();
                min.calculate(numbers);
            case Count:
                Count count = new Count();
                result = count.calculate(numbers);

        }
        return  result;
    }



    }

