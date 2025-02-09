/* Find the largest of three numbers. */

package Problems;

import java.util.Scanner;

public class threenumbers{
    public static void main(String[] args){
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = scan.nextLine();
        a = Integer.parseInt(input);
        System.out.println("Enter another number: ");
        input = scan.nextLine();
        b = Integer.parseInt(input);
        System.out.println("Enter a final number: ");
        input = scan.nextLine();
        c = Integer.parseInt(input);
        int largest = 0;
        if(a > b && a > c){
            largest = a;
        }
        else if(b > c && b > a){
            largest = b;
        }
        else if(c > a && c > b){
            largest = c;
        }
        else if(a == b || b == c || c == a){
            System.out.println("More than one number has the highest Value");
            scan.close();
            System.exit(0);
        }
        System.out.printf("Of the numbers: %d %d and %d, %d is the hightest\n",
                            a, b, c, largest);

    }
}