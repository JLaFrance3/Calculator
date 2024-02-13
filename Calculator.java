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
        System.out.println("Please enter one of the following:" +
            "\nAddition\nSubtraction" + 
            "\nMultiplication\nDivision\n");
        selection = scan.nextLine();

        //Calulate total based on user selection with minor error checking
        switch (selection.toUpperCase().charAt(0)) {
            
            case 'A':   //Addition
                System.out.println("\nYou have selected Addition");
                System.out.printf("%d + %d = %,d", num1, num2, num1+num2);
                break;
                
            case 'S':   //Subtraction
                System.out.println("\nYou have selected Subtraction");
                System.out.printf("%d - %d = %,d", num1, num2, num1-num2);
                break;

            case 'M':   //Multiplication
                System.out.println("\nYou have selected Multiplication");
                System.out.printf("%d * %d = %,d", num1, num2, num1*num2);
                break;

            case 'D':   //Division
                System.out.println("\nYou have selected Division");
                System.out.printf("%d %% %d = %,d", num1, num2, num1/num2);
                break;

            default:    //Invalid Entry
                System.out.println("Invalid Selection");
                break;
        }

        scan.close();
    }

}
