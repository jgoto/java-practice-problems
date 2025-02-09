/* Find the area of a circle given the radius.
 * A = Pi r^2
 */

package Problems;

import java.util.Scanner;

public class radiusofcircle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String input = scan.nextLine();
        int radius = Integer.parseInt(input);
        double area = Math.PI * (Math.pow(radius, 2));
        System.out.printf("A circle with the radius of %d has an area of %f", radius, area);
        scan.close();
    }
    
}
