/* Check if a number is positive, negative, or zero. 
 * x / |x| = 1 and -x / |x| = -1 and 0 = 0
*/

package Problems;

import java.util.Scanner;

public class checknumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        String input = scan.nextLine();
        int number = Integer.parseInt(input);
        if(number == 0){
            System.out.printf("%d is Zero\n", number);
        }
        else{
            int sign = number / Math.abs(number);
            if(sign == 1){
                System.out.printf("%d is Positive\n", number);
            }
            else if(sign == -1){
                System.out.printf("%d is Negative\n", number);
            }
        }
    }
}
