/* Check if a number is prime.
 * if n <= 1 it is not prime
 * if n = 2 or 3 it is prime
 */

package Problems;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = Integer.parseInt(scan.nextLine());
        System.out.printf("%d %s Prime\n", num, checkIfPrime(num) ? "is" : "is not");
        scan.close();
    }

    public static boolean checkIfPrime(int n){
        if(n<=1){
            return false;
        }
        else if(n==2 || n==3){
            return true;
        }
        else{
            for (int i = 4; i < n-1; i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
