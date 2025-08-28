import java.util.Scanner;

public class lab2 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static char calcAverage(int g1, int g2, int g3){
        int average = (g1+g2+g3)/3;
        if (average >= 90){
            return 'A';
        } else if  (average >= 80){
            return 'B';
        } else if (average >= 70){
            return 'C';
        } else if (average >= 60){
            return 'D';
        } else{
            return 'F';
        }
    }
    public static void main(String[] args){
        int score1 = getIntInput("Enter your first test score: ");
        int score2 = getIntInput("Enter your second test score: ");
        int score3 = getIntInput("Emter your third test score: ");
        System.out.println("Your average letter grade is a "+calcAverage(score1,score2,score3));

    }
}