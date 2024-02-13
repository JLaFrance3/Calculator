import java.util.Scanner;

public class Calculator {
    
    public static void main(String args[]) {
        
        int num1;           //User entered number
        int num2;           //User entered number
        String selection;   //Addition or Subtraction selection

        Scanner scan = new Scanner(System.in);
        
        //Obtain user inputs
        System.out.print("First number:\t");
        num1 = scan.nextInt();
        System.out.print("Second number:\t");
        num2 = scan.nextInt();
        scan.nextLine();

        //Prompt user for Addition or Subtraction
        System.out.println("Please enter one of the following:\nAddition\nSubtraction\n");
        selection = scan.nextLine();

        //Calulate total based on user selection with minor error checking
        if (selection.toUpperCase().charAt(0) == 'A') {
            System.out.println("\nYou have selected Addition");
            System.out.printf("%d + %d = %d", num1, num2, num1+num2);
        }
        else {
            System.out.println("\nYou have selected Subtraction");
            System.out.printf("%d - %d = %d", num1, num2, num1-num2);
        }

        scan.close();
    }

}
