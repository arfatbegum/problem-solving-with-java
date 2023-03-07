package ExamQuestions;

import java.util.Scanner;

public class Hexagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the hexagonal side:");
        double s=input.nextDouble();
        double area = ((3 * Math.sqrt(3)/2) * Math.pow(s,2) );
        double perimeter = 6 * s;
        System.out.printf("Area = %.2f\n", area);
        System.out.printf("perimeter = %.2f\n", perimeter);
    }
}
