import java.util.Scanner;
public class lab4 {

    public static int score = 0;

    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static String check(String guess,String answer){
        if (guess.toLowerCase().equals(answer.toLowerCase())){
            score++;
            return "Correct!";
        }else{
            return "Wrong the correct answer was "+answer;
        }
    }
 
    public static void main(String[] args) {
        String guess = getInput("What is Mr. Gardner's first name? ");
        System.out.println(check(guess,"Ethan"));

        guess = getInput("Where is Mr. Gardner from? ");
        System.out.println(check(guess,"Arkansas"));

        guess = getInput("Who does Mr. Gardner share a classroom with (Do not include Mr/Ms/Mrs/Mx)? ");
        System.out.println(check(guess,"Keller"));

        guess = getInput("Who is the final boss of Final Fantast IV? ");
        System.out.println(check(guess,"Zeromus"));
        System.out.println("Score: "+score+"/4");


    }
}