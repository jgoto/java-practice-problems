/* Calculate the sum of all numbers from 1 to N */

package Problems;
import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter a number: ");
        int num = Integer.parseInt(scan.nextLine());
        System.out.print("The Sum of all the numbers from 1 to " + num + " is ");
        while(num > 0)
        {
            sum+=num;
            num--;
        }
        System.out.println(sum);
        scan.close();        
    }
}
