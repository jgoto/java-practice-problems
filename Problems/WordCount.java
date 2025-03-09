package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class WordCount {
    public static void main(String[] args){
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("Problems/lorem.txt"))){
            String text;
            while((text = reader.readLine())!= null){
                String[] strArry = text.split("[\\s]");
                for(int i = 0; i < strArry.length; i++){
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("There was an error: " + e.getMessage());
        }
        System.out.println("The number of words is " + count);
    }
}
