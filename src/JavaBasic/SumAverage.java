package JavaBasic;
// A small program that reads 2 integers from the user using
// the class Scanner, computes and displays their sum and average
import java.util.Scanner;
public class SumAverage {
    public static void main(String[] args) {
// create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int number1, number2, sum;
        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read 1st number from user
        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read 2nd number from user
        sum = number1 + number2;
        double average = (double) sum / 2;
        String message = "Sum is";
        System.out.printf("%s %d\n", message, sum);
        System.out.printf("Average is %.2f\n", average);
    }
}