import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {

    public static void gamePlay(int userIn,int sysIn) {

        if (userIn == 1) {
            System.out.println("You have chosen Stone . ");
        }
        else if (userIn == 2) {
            System.out.println("You have chosen Paper . ");
        }
        else if (userIn == 3) {
            System.out.println("You have chosen Scissors . ");
        }
        if (sysIn == 1) {
            System.out.println("Computer has chosen Stone . ");
        }
        else if (sysIn == 2) {
            System.out.println("Computer has chosen Paper . ");
        }
        else if (sysIn == 3) {
            System.out.println("Computer has chosen Scissors . ");
        }

        if ((userIn == 1 && sysIn == 1) || (userIn == 2 && sysIn == 2) || (userIn == 3 && sysIn == 3)) {
            System.out.println("The Game is DRAW .");
        }
        else if ((userIn == 1 && sysIn == 3) || (userIn == 2 && sysIn == 1) || (userIn == 3 && sysIn == 2)) {
            System.out.println("You are the WINNER . ");
        }
        else {
            System.out.println("Computer is the WINNER . ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Enter your Choice -\n 1 for Stone ,\n 2 for Paper ,\n 3 for Scissors .");     // Enter user's choice
        int userInput = sc.nextInt();

        int sysInput = ran.nextInt(1, 4);     
        
        gamePlay(userInput, sysInput);
        
    }
    
}
