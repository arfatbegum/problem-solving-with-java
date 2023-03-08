package ExamQuestions;

import java.util.Scanner;

public class Triangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 sides of a triangle: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        double perimeter=a+b+c;

       if(a<0 || b<0 || c<0)
       System.out.println("Invalid Inputs");
       else {
           System.out.printf("Area= %.2f\n", area);
           System.out.printf("perimeter= %.2f\n ", perimeter);
       }

    }
}
