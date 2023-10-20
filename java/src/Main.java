import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueWithAnotherNumber = true;

        while(continueWithAnotherNumber) {
            System.out.println("Welcome to the Metric converter!");

            System.out.println("Please enter a whole number: ");
            int userNumber = scanner.nextInt();

            System.out.println("enter Meters to Feet(1) or Feet to Meters(2)");
            int unit = scanner.nextInt();
            double finalResult = 0;
            if (unit == 1) {
                finalResult = userNumber * 3.281;
                finalResult = Math.round((finalResult * .10) / .10);
                System.out.println(userNumber + " Meter = " + finalResult+ " Feet.");

            } else if (unit == 2) {
                finalResult = userNumber / 3.281;
                finalResult = Math.round((finalResult * .10) / .10);
                System.out.println(userNumber + " Feet = " + finalResult + " Meters.");
            } else {
                System.out.println("Invalid entry please try again!");
            }
            System.out.println("Would you like to convert another number? ((1) for Yes or (2) for No");
            int continueChoice = scanner.nextInt();

            if (continueChoice == 0){
                continueWithAnotherNumber = false;
            }
        }
        System.out.println("Thank you for using the Metric converter!");
    }
}