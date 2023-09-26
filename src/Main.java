import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String nextLine = "";
        boolean done = false;

        do {
            System.out.print("Enter playerA move: [R P S]: ");
            playerA = scanner.nextLine();
            System.out.print("Enter playerB move: [R P S]: ");
            playerB = scanner.nextLine();

            if (playerA.equals("R") || playerA.equals("r")) {
                if (playerB.equals("R"))
                {
                    System.out.println("Rock vs Rock, it's a TIE!");
                }
                else if (playerB.equals("P") || playerB.equals("p"))
                {
                    System.out.println("Paper beats rock so Player B WINS!");
                }
                else {
                    System.out.println("Rock breaks scissors so Player A WINS!");
                }
            }
            else if (playerA.equals("P") || playerA.equals("p"))
            {
                if (playerB.equals("R") || playerB.equals("r"))
                {
                    System.out.println("Paper beats Rock so Player A WINS!");
                }
                else if (playerB.equals("P") || playerB.equals("p"))
                {
                    System.out.println("Paper vs Paper, it's a TIE!");
                }
                else
                {
                    System.out.println("Scissors cuts paper so Player B WINS!");
                }
            }
            else if (playerA.equals("S") || playerA.equals("s"))
            {
                if (playerB.equals("R") || playerB.equals("r"))
                {
                    System.out.println("Rock breaks scissors so Player A WINS!");
                }
                else if (playerB.equals("P") || playerB.equals("p"))
                {
                    System.out.println("Scissors cuts paper so Player A WINS!");
                }
                else
                {
                    System.out.println("Scissors vs scissors, it's a TIE!");
                }
            }
            else
            {
                System.out.print("Please enter an invalid input and try again!");
                nextLine = scanner.nextLine();
                done = true;
            }

            System.out.print("Do you want to play again? [Y/N]: ");
            nextLine = scanner.nextLine();
            done = true;
        }
        while (done);

        scanner.close();
    }
}