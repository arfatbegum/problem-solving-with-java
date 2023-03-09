package ExamQuestions;

import java.util.Scanner;

public class MaxCreditHours {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a student GPA:");
        double GPA = input.nextDouble();

        if((GPA >= 0) &&( GPA <= 4))
            if(GPA >= 2)
               System.out.println("Maximum credit hours to be registered: 21");
            else
               System.out.println("Maximum credit hours to be registered: 16");
        else
            System.out.println("Invalid GPA");
    }
}
