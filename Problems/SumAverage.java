/* Calculate the sum and average of an array. */

package Problems;
import java.util.Arrays;
import java.util.Random;

public class SumAverage {
    public static void main(String[] args){
        Random rand = new Random();
        int[] nums = new int[30];
        for(int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(100);
        }
        System.out.println("The Numbers Are: ");
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        double average = 0;
        for(int i = 0; i< nums.length; i++){
            sum+= nums[i];
        }
        average = sum;
        average = average / nums.length;
        System.out.println("The sum is " + sum + " and the average is " + String.format("%.2f",average));
    }
}
