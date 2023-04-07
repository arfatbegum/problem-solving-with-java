package ExamQuestions;
// This program solves class-average problem using
// sentinel-controlled repetition.
import java.util.Scanner;
public class ClassAverage2 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int total, gradeCounter, grade;
        double average;
        total = 0;
        gradeCounter = 0;
        System.out.print("Enter a grade or -1 to quit: ");
        grade = input.nextInt();
        // loop until sentinel value read from user
        while ( grade != -1 ) {
            total = total + grade; // add grade to total
            gradeCounter++;
            System.out.print("Enter a grade or -1 to quit: ");
            grade = input.nextInt();
        }
        if (gradeCounter != 0) { // if user entered at least one grade
            average = (double) total / gradeCounter;
            System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
        }
        else
            System.out.println("No grades were entered");
    }
}