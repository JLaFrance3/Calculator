import java.util.Scanner;

public class Calculator {
    
    public static void main(String args[]) {
        
        double num1;        //User entered number
        double num2;        //User entered number
        String selection;   //Addition or Subtraction selection

        Scanner scan = new Scanner(System.in);
        
        //Obtain user inputs
        System.out.print("First number:\t");
        num1 = scan.nextDouble();
        System.out.print("Second number:\t");
        num2 = scan.nextDouble();
        scan.nextLine();

        //Prompt user for Addition or Subtraction
        System.out.println("Please enter one of the following:" +
            "\nAddition\nSubtraction" + 
            "\nMultiplication\nDivision\n");
        selection = scan.nextLine();

        //Calulate total based on user selection with error checking
        switch (selection.toUpperCase().charAt(0)) {
            
            case 'A':   //Addition
                System.out.println("\nYou have selected Addition");
                System.out.printf("%,.2f + %,.2f = %,.2f", num1, num2, num1+num2);
                break;
                
            case 'S':   //Subtraction
                System.out.println("\nYou have selected Subtraction");
                System.out.printf("%,.2f - %,.2f = %,.2f", num1, num2, num1-num2);
                break;

            case 'M':   //Multiplication
                System.out.println("\nYou have selected Multiplication");
                System.out.printf("%,.2f * %,.2f = %,.2f", num1, num2, num1*num2);
                break;

            case 'D':   //Division
                //Check for division by 0
                if(num2 == 0) {
                    System.out.println("\nError: Divide by Zero");
                }
                else {
                    System.out.println("\nYou have selected Division");
                    System.out.printf("%,.2f %% %,.2f = %,.2f", num1, num2, num1/num2);
                }
                break;

            default:    //Invalid Entry
                System.out.println("Invalid Selection");
                break;
        }

        scan.close();
    }

}
