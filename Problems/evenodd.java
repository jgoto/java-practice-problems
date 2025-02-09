/* Check if a number is even or odd */

package Problems;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(scan.nextLine());
        if(num%2==0)
        {
            System.out.println(num + " is even");
        }
        else
        {
            System.out.println(num + " is odd");
        }
        scan.close();
    }
}
