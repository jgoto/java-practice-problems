/* Implement a method that takes a file name as input and throws an exception if the file is not found. */

package Problems;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MissingFile {
    public static void main(String[] args){
        File file = new File("Problems/MISSING.txt");
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 
    }
}
