/* Append new content to an existing file without overwriting */

package Problems;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class AppendFile{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Problems/test.txt", true))){
            boolean loop = true;
            while(loop==true){
                System.out.println("Add something to the file: ");
                writer.write(scan.nextLine()+"\n");
                System.out.println("Do you want to add something else: ");
                String keepGoing = scan.nextLine();
                if(keepGoing.equals("no") || keepGoing.equals("No")){
                    loop = false;
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong" + e.getMessage());
        } finally {
            scan.close();
        }
    }
}