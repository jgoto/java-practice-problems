/* Find the factorial of a number */

package Problems;
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = Integer.parseInt(scan.nextLine());
        int factorial = getFactorial(num);
        System.out.println("The factorial of " + num + " is " + factorial);
        scan.close();
    }

    public static int getFactorial(int num){
        if(num==1)
        {
            return 1;
        }
        else
        {
            return num*(getFactorial(num-1));
        }
    }
}