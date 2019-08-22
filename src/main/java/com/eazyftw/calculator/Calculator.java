package com.eazyftw.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("Enter another integer: ");
        int number1 = input.nextInt();
        System.out.println("Please enter an operation: ");
        String operation = input.next();
        int answer;
        OperationEnum operationEnum = OperationEnum.getOperationFromValue(operation);
        if(operationEnum == OperationEnum.ADDITION) {
            answer = number + number1;
        } else if(operationEnum == OperationEnum.SUBTRACTION) {
            answer = number - number1;
        } else if(operationEnum == OperationEnum.MULTIPLICATION) {
            answer = number * number1;
        } else if(operationEnum == OperationEnum.DIVISION) {
            answer = number / number1;
        } else {
            answer = 0;
        }
        System.out.println("The answer is " + answer);


    }

}
