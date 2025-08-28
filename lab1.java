import java.util.Scanner;

public class lab1 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
 
    public static void main(String[] args) {
        int faren = getIntInput("Enter a temperature in fahrenheit: ");
        int celc = (faren-32) * 5/9;
        System.out.println("The temperature in degrees celcius is "+celc);
    }
}
