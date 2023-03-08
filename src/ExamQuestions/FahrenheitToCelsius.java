package ExamQuestions;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit:");
        float fahrenheit = input.nextFloat();
        double celsius = 5 * (fahrenheit-32)/9;
        System.out.printf("Fahrenheit = %.2f\n", fahrenheit);
        System.out.printf("Celsius = %.2f\n", celsius);
    }
}
