/* Write a program to read a file and print its contents. */

package Problems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new FileReader("Problems/lorem.txt"))){
            String text;
            while ((text = reader.readLine())!=null) {
                System.out.println(text);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}