package ExamQuestions;

import java.util.Scanner;

public class GPAChecked {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of credit hours:");
        int CreditHours = input.nextInt();
        System.out.println("Enter GPA:");
        double GPA = input.nextDouble();

        if(CreditHours >= 45 && GPA >= 3.67)
        System.out.println("You will be placed on the Honor List");
        else
            System.out.println("You will not be placed on the Honor List");
    }
}
