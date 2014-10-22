import java.util.Scanner;
public class RockPaperScissors
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String playagain = "y";
        while (playagain.equals("y"))
        {
            System.out.println("Player 1: Choose rock, paper, or scissors:");
            String player1 = scan.next().toLowerCase();
            if (player1.equals("rock"))
            {
                System.out.println("Player 2: Choose rock, paper, or scissors:");
                String player2 = scan.next().toLowerCase(); 
                if (player2.equals("rock"))
                {
                    System.out.println("Player 1 and Player 2 tied.");
                }
            
                else if (player2.equals("paper"))
                {
                    System.out.println("Player 2 beat Player 1.");
                }
            
                else if (player2.equals("scissors"))
                {
                    System.out.println("Player 1 beat Player 2.");
                }
            
                else
                {
                    System.out.println("That is not a valid option.");
                }
            }
            
            else if (player1.equals("paper"))
            {
                System.out.println("Player 2: Choose rock, paper, or scissors:");
                String player2 = scan.next().toLowerCase(); 
                if (player2.equals("rock"))
                {
                    System.out.println("Player 1 beat Player 2.");
                }
            
                else if (player2.equals("paper"))
                {
                    System.out.println("Player 1 and Player 2 tied.");
                }
            
                else if (player2.equals("scissors"))
                {
                    System.out.println("Player 2 beat Player 1");
                }
            
                else
                {
                    System.out.println("That is not a valid option.");
                }
            }
        
            else if (player1.equals("scissors"))
            {
                System.out.println("Player 2: Choose rock, paper, or scissors:");
                String player2 = scan.next().toLowerCase(); 
                if (player2.equals("rock"))
                {
                    System.out.println("Player 2 beat Player 1.");
                }
            
                else if (player2.equals("paper"))
                {
                    System.out.println("Player 1 beat Player 2.");
                }
            
                else if (player2.equals("scissors"))
                {
                    System.out.println("Player 1 and Player 2 died.");
                }
                else
                {
                    System.out.println("That is not a valid option.");
                }
            }
            else
            {
                System.out.println("That is not a valid option.");
            }
            System.out.println("Would you like to play again? (y/n): ");
            playagain = scan.next().toLowerCase();
        }
    }
}