/* Print the Fibonacci series up to N terms. 
 * f(n) = f(n-1) + f(n-2)
 * f(0) = 0, f(1) = 1
*/

package Problems;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers of the Fibonacci sequence: ");
        int num = Integer.parseInt(scan.nextLine());
        for(int i = 0; i <= num; i++){
            System.out.print(getFibonacci(i)+" ");
        }
        scan.close();
    }

    public static int getFibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else
        {
            return (getFibonacci(n-1)+getFibonacci(n-2));
        }
    }
}
