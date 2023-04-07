package ExamQuestions;
// This program solves class-average problem using
// counter-controlled repetition.
import java.util.Scanner;
public class ClassAverage1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total;
        int grade;
        double average;
        total = 0;
        for (int count=1; count<=10; count++) // loop 10 times
        {
            System.out.print("Enter a grade: "); // prompt
            grade = input.nextInt(); // read grade from user
            total = total + grade; // add grade to total
        }
        average = (double) total / 10;
        System.out.printf("Total of all 10 grades is %d\n", total);
        System.out.printf("Class average is %.2f\n", average);
    }
}
