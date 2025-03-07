/* Write a program to write text to a file */

package Problems;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void main(String[] args){
        Path path = Path.of("Problems/test.txt");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something to save: ");
        String input = scan.nextLine();
        List<String> text = List.of("Hello World!", "This is a test", input);
        try {
            Files.write(path, text);
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
