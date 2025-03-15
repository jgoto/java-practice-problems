/* Copy the contents of one file to another file. */

package Problems;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;

public class CopyContent{
    public static void main(String[] args){
        List<String> content = new ArrayList<>();
        Path path = Path.of("Problems/test2.text");
        content.add("This is a copy!");
        try (BufferedReader reader = new BufferedReader(new FileReader("Problems/test.txt"))) {
            String text;
            while((text = reader.readLine())!=null){
                content.add(text);
            }
            Files.write(path, content);
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        System.out.println(content);
    }
}