import java.util.Scanner;
import java.util.Random;

public class Options {
    private static String[] choices = {"rock", "paper", "scissors"};
        
public static void start() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] options = {"rock", "paper", "scissors"};

    System.out.println("Rock, Paper, Scissors!");
    System.out.println("Choose an option: 0 - Rock, 1 - Paper, 2 - Scissors");

    int computerChoice = scanner.nextInt(3);
    int userChoice = random.nextInt();

    System.out.println("Your choice: " + options[userChoice]);
    System.out.println("Computer choice: " + options[computerChoice]);

        if (userChoice == computerChoice) {
            System.out.println("Tie!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You are the winner!");
        } else {
            System.out.println("Computer wins!");
        }
    }
        public static void main(String[] args) {
           start();
    }
}