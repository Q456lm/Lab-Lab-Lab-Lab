import java.util.Scanner;

public class lab3 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static String guessNumber(int guess, int randynumber){
        if (randynumber == guess){
            return "Correct!";
        }else if (randynumber > guess){
            return "To low!";
        }else{
            return "To high!";
        }
    }
    public static void main(String[] args){
        String correct = "Wrong";
        int randomn = (int)(Math.random()*101);
        while (correct != "Correct!"){
            int guess = getIntInput("I'm thinking of a number from 1 to 100, what do you think it is: ");
            correct = guessNumber(guess,randomn);
            System.out.println(correct);
        }
    }
}