//(Duplicate Elimination) Use a one-dimensional array to solve the following problem:
//Write an application that inputs five numbers, each between 10 and 100, inclusive.
// As each number is read, display it only if it’s not a duplicate of a number already read.
// Provide for the “worst case, in which all five numbers are different. Use the smallest
// possible array to solve this problem. Display
//the complete set of unique values input after the user enters each new value.


import javax.swing.*;

public class Elimination {
    private int[] numbers;

    public Elimination(){
        this.numbers = new int[5];
    }

    public int[] getNumbers(){
        return  numbers;
    }

    public int getInput() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Please input your number"));
        return input;
    }

    public  boolean isInputValid() {
        if (getInput() < 10 || getInput() > 100) {
            String message = String.format("Invalid input. input digits between 10 & 100");
            JOptionPane.showMessageDialog(null, message);
            return false;
        }
        return true;
    }

    public  void appendElements() {
        for (int element = 0; element < numbers.length; element++) {
            int temp = getInput();
            if(isNotADuplicateNumber(temp))
                numbers[element] = temp;

        }
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public boolean isNotADuplicateNumber(int temp) {
        for (int element : numbers) {
            /*if(temp != numbers[element]){
                numbers[element] = temp;
                String message = String.format("input is %d", numbers[element]);
                JOptionPane.showMessageDialog(null, message);*/
            if(element == temp){
                return false;
            }
        }
        return  true;
    }

}


