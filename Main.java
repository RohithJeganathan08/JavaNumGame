import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int number = rand.nextInt(10);
    String yesno;
    System.out.println("In this game, you will have to guess a number from 1 to 10. Keep on guessing until you guess the number");
    System.out.println("");
  System.out.println("Would you like to start? (Yes/No)");
    yesno = scan.nextLine();
  if (yesno == "Yes") {
    System.out.println("We shall start");
  } else {
    System.out.println("We are still going to start");
  }
    System.out.println("");
    System.out.println("Guess a number: ");
    int input = scan.nextInt();
    while (input != number) {
        System.out.println("Try again");
        input = scan.nextInt();
    }
    System.out.println("You succeeded in guessing");

  }
}