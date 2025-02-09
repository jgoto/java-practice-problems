/* Print the multiplication table of a given number.
 * up to 12
 */

package Problems;
import java.util.Scanner;

public class Multiplications {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        for(int i = 1; i <= 12; i++){
            System.out.printf("%d * %d = %d\n",i, num, i*num);
        }
        scan.close();
    }
}
