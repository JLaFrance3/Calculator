import java.util.Scanner;

public class Calculator {
    
    public static void main(String args[]) {
        
        int num1;       //user entered number
        int num2;       //user entered number

        Scanner scan = new Scanner(System.in);
        
        System.out.print("First number:\t");
        num1 = scan.nextInt();

        System.out.print("Second number:\t");
        num2 = scan.nextInt();

        System.out.printf("%d + %d = %d", num1, num2, num1+num2);

        scan.close();
    }

}
