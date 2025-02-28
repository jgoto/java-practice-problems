/* Write a program that divides two numbers and catches ArithmeticException if division by zero occurs. */

package Problems;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideZero {
    public static void main(String[] args){
        double a, b;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            a = scan.nextDouble();
            System.out.println("Enter another number: ");
            b = scan.nextDouble();
            double c = a / b;
            System.out.printf("Your first number divided by your second number is %.2f\n", c);            
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero");
        } catch(InputMismatchException e){
            System.out.println("Not an integer");
        }
        
        scan.close();
    }    
}
