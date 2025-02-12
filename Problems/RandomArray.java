/* Declare and initialize a random array of 5 integers, then print them. */
package Problems;
import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args){
        Random rand = new Random();
        int[] randomNums = new int[5]; 
        for(int i = 0; i < randomNums.length; i++){
            randomNums[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(randomNums));
    }
}
