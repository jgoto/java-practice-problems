/* Demonstrate throw and throws keywords in Java. */

package Problems;
import java.util.Scanner;

public class DemoThrows {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter a positive number: ");
            int a = getPositiveInteger(scan);
            System.out.printf("The Square Root of %d is %.4f", a, Math.sqrt(a));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Something went wrong");
        } finally {
            scan.close();
        }
    }    

    static int getPositiveInteger(Scanner scan) throws IllegalArgumentException{ 
        int num = scan.nextInt();
        if(num <= 0){
            throw new IllegalArgumentException("Number must be positive");
        }
        return num;
    }
}


