/* Find the maximum and minimum elements in an array */

package Problems;
import java.util.Arrays;
import java.util.Random;

public class MinMax {
    public static void main(String[] args){
        Random rand = new Random();
        int[] nums = new int[30];
        for(int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(100);
        }
        System.out.println("The Numbers Are: ");
        System.out.println(Arrays.toString(nums));

        int min = nums[0], max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min)
            {
                min = nums[i];
            }
            if(nums[i] > max)
            {
                max = nums[i];
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
    }
}
