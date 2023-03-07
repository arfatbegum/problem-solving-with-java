package ExamQuestions;

import java.util.Scanner;

public class FinalExamPermission {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter TMA Score:");
        float TMAScore=input.nextFloat();
        System.out.println("Enter MTA Score:");
        float MTAScore=input.nextFloat();
        float totalScore= TMAScore + MTAScore;
        System.out.printf("Total Score = %.2f\n:",totalScore);

        if (TMAScore>20 || MTAScore>30)
            System.out.println("Invalid Input");
        else if (totalScore>=15)
        System.out.println("The student is  permitted to go for the final exam");
        else
        System.out.println("The student is NOT permitted to go for the final exam");

    }
}
