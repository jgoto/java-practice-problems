package problmes2.gradebook;

public class Student {
    private String name;
    private String id;
    private double gpa;

    Student(String name, String id, double grade){
        this.name = name;
        this.id = id;
        this.gpa = grade;    
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public String toString(){
        return String.format("Student: %s\nID: %s\nGPA: %.1f", getName(), getId(), getGpa());
    }
}
