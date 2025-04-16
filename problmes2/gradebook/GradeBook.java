package problmes2.gradebook;
/* Create a system that stores student names and their list of grades. 
It should compute GPA, allow grade updates, and list top students. */

public class GradeBook {
    public static void main(String[] args){
        Student student = new Student("Joe Smith", "JS-21", 3.12);
        System.out.println(student);
    }
}
