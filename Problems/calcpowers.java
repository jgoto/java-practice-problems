/* Calculate the power of a number without using Math.pow() */
package Problems;

import java.util.Scanner;

public class calcpowers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("Enter a power");
        input = scan.nextLine();
        int pow = Integer.parseInt(input);
        System.out.printf("%d ^ %d = ", num, pow);
        int result = 1;
        scan.close();
        if(pow!=0){
            for(int i = 0; i < pow; i++)
            {
                result = num * result;
            }
        }
        System.out.println(result);
        scan.close();
    }
    
}
