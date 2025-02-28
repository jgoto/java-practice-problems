/* Handle an ArrayIndexOutOfBoundsException when accessing an invalid index in an array */

package Problems;
import java.util.InputMismatchException;
import java.lang.IndexOutOfBoundsException;
import java.util.Scanner;
import java.util.Random;

public class ArrayException {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int input;
        int[] nums = new int[7];
        for(int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(20);
        }
        try {
            System.out.println("Enter a number: ");
            input = scan.nextInt();
            System.out.println("Your number is: " + nums[input]);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input: Enter an integer");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Your selected number does not exist");
        }
        scan.close();
    }    
}
