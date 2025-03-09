/* Split a string into individual words */

package Problems;

public class StringSplit {
    public static void main(String[] args){
        String text = "The quick brown fox jumps over the lazy dog.";
        String regex = "[\\s]";
        String[] strArray = text.split(regex);

        for(String s : strArray){
            System.out.println(s);
        }
    }
}
