/* Count occurrences of a specific element in an array. */

package Problems;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CountOccurrences{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[13];
        for(int i=0; i < nums.length; i++){
            nums[i] = rand.nextInt(10);
        }
        System.out.println("Here are the following numbers: " + Arrays.toString(nums));
        boolean loop = true;
        int input = 0;
        int count = 0;
        while(loop){
            System.out.println("Enter a number: ");
            input = Integer.parseInt(scan.nextLine());
            for(int i = 0; i < nums.length; i++){
                if(nums[i]==input){
                    count++;
                }
                if(count > 0)
                {
                    loop = false;
                }
            }
        }
        System.out.println(input + " was entered " + count + " times");        
        scan.close();
    }
}