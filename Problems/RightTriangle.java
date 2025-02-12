/* Print a right-angled triangle pattern using * */

package Problems;
import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a length for your Right Triangle: ");
        int length = Integer.parseInt(scan.nextLine());
        printRightTriangle(length);
        scan.close();
    }
    
    public static void printRightTriangle(int length){
        for(int i = 1; i <= length; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
