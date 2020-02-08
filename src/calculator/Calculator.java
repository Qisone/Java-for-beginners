package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter first number\n");
        int first = keyboard.nextInt();

        System.out.println("enter second number\n");
        int second = keyboard.nextInt();

        int sum = sum(first, second);
        System.out.println("Result = " + sum);


    }

    public static int sum(int first, int second) {
        return first + second;
    }

//    public static int
}

