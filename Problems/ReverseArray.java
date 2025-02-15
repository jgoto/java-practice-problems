/* Reverse an array */

package Problems;
import java.util.Arrays;
import java.util.Random;

public class ReverseArray {
    public static void main(String[] args){
        Random rand = new Random();
        int[] nums = new int[15];
        for(int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(100);
        }
        System.out.println("Your numbers are: " + Arrays.toString(nums));
        for(int i = 0; i < nums.length/2; i++)
        {
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
            System.out.println(Arrays.toString(nums));
        }

        System.out.println("Your numbers reversed are: " + Arrays.toString(nums));
    }
}
