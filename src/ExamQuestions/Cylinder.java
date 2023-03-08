package ExamQuestions;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter radius and height of a cylinder:");
        double r= input.nextDouble();
        double h= input.nextDouble();
        double area = 2 * Math.PI * r * (r+h);
        double volume = Math.PI * Math.pow(r,2) * h;

            if (r<0 || h<0)
                System.out.println("Wrong Inputs. Negative numbers are not accepted");
            else {
                System.out.printf("Cylinder complete area = %.2f\n", area);
                System.out.printf("Cylinder volume = %.2f\n", volume);
            }
    }
}
