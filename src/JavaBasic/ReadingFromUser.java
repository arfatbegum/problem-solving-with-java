package JavaBasic;
// To read different types of information from the user
import java.util.Scanner;
public class ReadingFromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, profession;
        double height; char gender;
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your profession: ");
        profession = input.next();
        System.out.print("Enter your height: ");
        height = input.nextDouble();
        System.out.print("Enter your gender (M/F): ");
        gender = input.next().charAt(0);
        System.out.println("-------");
        System.out.printf("%s %s%n%s %s%n%s %.2f%n%s %c%n"
                ,
                "Name:", name, "Profession:", profession,
                "Height:", height, "Gender:", gender);
    }
}