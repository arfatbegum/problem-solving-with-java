package ExamQuestions;

import java.util.Scanner;

public class CirclePoint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of the point:");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Enter the coordinates of the center of the circle:");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter the radius of the circle:");
        double r = input.nextDouble();
        double distance = Math.sqrt(Math.pow(x-a, 2) + Math.pow(y-b, 2));
        System.out.printf("distance between the point and the center of the circle d = %.2f\n", distance);

        if (r<0)
            System.out.println("INVALID INPUTS");
        else if ( distance < r || distance==r)
            System.out.println("Point is INSIDE the circle");
        else 
            System.out.println("Point is OUTSIDE the circle");

    }
}
