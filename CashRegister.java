import java.util.Scanner; // Imports the scanner class, used for collecting user input.
import java.lang.Math; // Imports the Math language, which is used for more complicated mathematical operations.


class Main {
  public static void main(String[] args) {
    double Bill, Payment, Change, ChangeOwed; // These variables are the monetary values. They have to be doubles to ensure that the program can accept real monetary inputs.
    int pennies, nickels, dimes, quarters, ones, fives, tens, twenties; // Creates a system that keeps track of each kind of money. They are integers because only whole amounts of each money can be returned.
    Scanner kin = new Scanner(System.in); // Imports the scanner into the program.
    System.out.println("Welcome to the Change Generator");
    System.out.println("\nPlease Enter the amount of a Bill");
    System.out.print("Bill: $");
    Bill = kin.nextDouble(); // Gets the input of the Bill amount from the user.
    System.out.println("\nPlease Enter the amount Paid");
    System.out.print("Paid: $");
    Payment = kin.nextDouble(); // Gets the input of the amount paid from the user.
    Change = (Payment - Bill); // Calculates the amount of change to return.
    System.out.println("\nChange: $" + Change);
    ChangeOwed = Change; // This snippet of code creates the amount of change to give the user, and will change each time the program runs through each monetary value.
    twenties = (int) ChangeOwed / 20; // Finds the amount of 20 dollar bills to return.
    ChangeOwed = ChangeOwed % 20; // Finds the total amount of change left after taking out 20 dollar values.
    System.out.println("$20: " + twenties);
    tens = (int) ChangeOwed / 10; // Finds the amount of 10 dollar bills to return.
    ChangeOwed = ChangeOwed % 10; // Finds the total amount of change after taking out 10 dollar values.
    System.out.println("$10: " + tens);
    fives = (int) ChangeOwed / 5; // Finds the amount of 5 dollar bills to return.
    ChangeOwed = ChangeOwed % 5; // Finds the total amount of change after taking out 5 dollar values.
    System.out.println("$5: " + fives);
    ones = (int) ChangeOwed / 1; // Finds the amount of 1 dollar bills to return.
    ChangeOwed = ChangeOwed % 1; // Finds the total amount of change after taking out 1 dollar values.
    System.out.println("$1: " + ones);
    quarters = (int) Math.floor(ChangeOwed/.25); // Finds the amount of quarters to return.
    ChangeOwed = ChangeOwed % .25; // Finds the total amount of change after taking out 25 cent values.
    System.out.println("$.25: " + quarters);
    dimes = (int) Math.floor(ChangeOwed/.1); // Finds the amount of dimes to return.
    ChangeOwed = ChangeOwed % .1; // Finds the total amount of change after taking out 10 cent values.
    System.out.println("$.10: " + dimes);
    nickels = (int) Math.floor(ChangeOwed/.05); // Finds the amount of nickels to return.
    ChangeOwed = ChangeOwed % .05; // Finds the total amount of change after taking out 5 cent values.
    System.out.println("$.05: " + nickels); // Finds the amount of pennies to return.
    pennies = (int) Math.floor(ChangeOwed/.01);
    ChangeOwed = ChangeOwed % .01; // Finds the total amount of change after taking out 1 cent values.
    System.out.println("$.01: " + pennies);
  }
}