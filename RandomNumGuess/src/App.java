import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int guessNum = 0;
        int randNum = 0;
        int chances = 5;
        boolean game = true;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        randNum = random.nextInt(100) + 1;

        while (game) 
        {
            System.out.println("============================");
            System.out.println("RANDOM NUMBER GUESSING GAME");
            System.out.println("============================");
            System.out.println("SELECT YOUR OPTION: \n");
            System.out.println("1. PLAY GAME[PRESS 1]\n2. END GAME[PRESS 2]\n");
            System.out.println("============================");
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("============================");
                    System.out.println("A RANDOM HAS BEEN SELECTED BETWEEN 1 AND 100");
                    System.out.println("YOU ARE GIVEN 5 CHANCES TO GUESS THE NUMBER!");
                    System.out.println("TRY GUESSING THE NUMBER!");
                    System.out.println("============================");
                    for(int i=0; i<chances; i++)
                    {
                        System.out.print("Enter your Guess: ");
                        guessNum = scan.nextInt();
                        if(guessNum < randNum)
                        {
                            System.out.println("TRY HIGHER\n");
                        }
                        else if(guessNum > randNum)
                        {
                            System.out.println("TRY LOWER\n");
                        }
                        else if(guessNum == randNum)
                        {
                            System.out.println("YOU HAVE SUCCESSFULLY GUESSED THE NUMBER!\n");
                        }
                        else if(guessNum < 1 || guessNum > 100)
                        {
                            System.out.println("============================");
                            System.out.println("PLEASE ENTER THE CORRECT NUMBER WITHIN THE LIMIT");
                            System.out.println("============================");
                        }
                    }
                    System.out.println("============================");
                    System.out.println("YOU HAVE LOST THE GAME :( )");
                    System.out.println("============================");
                    break;
                case 2:
                    System.exit(0);
            }
        }
        scan.close();
    }
}
