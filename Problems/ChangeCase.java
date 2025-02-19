/* Convert a string to uppercase and lowercase */

package Problems;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");        
        String text = scan.nextLine();
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        scan.close();
    }    
}
