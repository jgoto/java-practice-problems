/* Create an ArrayList of integers and add, remove, and iterate over elements */

package Problems;
import java.util.ArrayList;
import java.util.Scanner;

public class IterateCollection {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        boolean loop = true;
        while(loop){
            System.out.println("Please enter a positive number to add to the list, a negative number to remove(enter 0 to quit): ");
            int input = scan.nextInt();
            if(input == 0){
                loop = false;
            }
            else if(input < 0)
            {
                for(int i = 0; i < nums.size(); i++){
                    if(Math.abs(input) == nums.get(i)){
                        nums.remove(i);
                    }
                }
            }
            else if(input > 0)
            {
                nums.add(input);
            }
            
        }
        scan.close();
        System.out.println(nums);
    }
}
