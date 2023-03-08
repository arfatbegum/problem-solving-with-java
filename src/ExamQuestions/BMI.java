package ExamQuestions;

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight (kilograms): ");
        double w = input.nextInt();
        System.out.println("Enter your height (meters): ");
        double h = input.nextDouble();
        double bmi = w / (h * h);
        System.out.printf("Your BMI value = %.2f\n", bmi);
        if(bmi < 18.5)
            System.out.println("You are UNDERWEIGHT");
        else if(bmi <= 25)
            System.out.println("You are IDEAL");
        else if(bmi <= 30)
            System.out.println("You are OVERWEIGHT");
        else
            System.out.println("You are OBESE");
    }
}

