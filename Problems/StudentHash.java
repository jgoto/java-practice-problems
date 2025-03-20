/* Create a HashMap to store student names as keys and their scores as values, then retrieve a score by name. */
package Problems;
import java.util.HashMap;

public class StudentHash {
    public static void main(String[] args){
        HashMap<String, Double> students = new HashMap<>();
        students.put("Nick", 87.6);
        students.put("Lisa", 95.2);
        students.put("Mary", 42.0);
        students.put("Dave", 90.1);
        System.out.println(students.get("Nick"));
        System.out.println(students.get("Lisa"));
        System.out.println(students.get("Mary"));
        System.out.println(students.get("Dave"));
    }
}
