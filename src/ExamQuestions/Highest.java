package ExamQuestions;
// To find the highest grade in a class includes 10 students.
import java.util.Scanner;
public class Highest {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int max = -1;
        int grade; // grade entered by user
        for (int counter=1; counter<=10; counter++)
        {
            System.out.print("Enter a grade: ");
            grade = input.nextInt();
            if (grade > max)
                max = grade;
        }
        System.out.println("The highest grade is " + max);
    }
}
