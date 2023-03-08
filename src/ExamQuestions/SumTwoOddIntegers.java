package ExamQuestions;

import java.util.Scanner;

public class SumTwoOddIntegers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();

        int sum;
        if (num1%2==1 && num2%2==1 ){
            sum = num1 + num2;
            System.out.println("Sum = " + sum);
        }
        else
            System.out.println("Invalid Inputs");

    }
}
