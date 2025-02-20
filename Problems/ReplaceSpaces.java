/* Replace all spaces in a string with -. */

package Problems;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string with spaces");
        char[] characters = scan.nextLine().toCharArray();
        for(int i = 0; i < characters.length; i++){
            if(characters[i]==' '){
                characters[i] = '-';
            }
        }
        System.out.println(Arrays.toString(characters));
        scan.close();
    }
}
