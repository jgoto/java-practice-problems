/* Reverse a string without using built-in functions. */

package Problems;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        System.out.println("Please enter a string of text: ");
        Scanner scan = new Scanner(System.in);
        char[] text = scan.nextLine().toCharArray();
        char[] reverseText = new char[text.length];
        for(int i = 0; i < text.length; i++){
            reverseText[text.length - 1 - i] = text[i];
        }
        System.out.println("Original: " + Arrays.toString(text));
        System.out.println("Reversed: " + Arrays.toString(reverseText));
        scan.close();
    }
}
