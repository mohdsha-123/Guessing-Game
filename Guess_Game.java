import java.util.Scanner;
import java.util.Random;

public class Guess_Game {
    public static void main(String[] args) {
        
        // Range
        final int MAX = 100;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //  generate a random number between 1 to 100
        int randNumber = random.nextInt(MAX) + 1;

        // Attemps
        int trail = 0;

        boolean hasGuessed = false;

        System.out.println("Hey ! What is your name :");
        String name = sc.nextLine();
        System.out.println("Well " + name + ", I am thinking of a number between 1 and 100");

        while (!hasGuessed) {
            System.out.println("Take a guess : ");
            int guess = sc.nextInt();
            trail++;

            if (guess < randNumber) {
                System.out.println(" Your guess is too low! please try again ");
            } else if (guess > randNumber) {
                System.out.println("Your guess is too high! please try again ");
            } else {
                hasGuessed = true;
            }
        }

        System.out.println("Congratulations! you found the number "+randNumber + " in " + trail + " attemp6ts");
        System.out.println();
        sc.close();
    }
}
