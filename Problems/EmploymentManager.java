/* Create an Employee class with subclasses Manager and Developer, each with their own method. */

package Problems;

public class EmploymentManager {
    public static void main(String[] args){
        Manager dan = new Manager("Dan Smith", "01AB");
        Developer bob = new Developer("Bob Carter", "021qb");
        bob.setManager(dan);
        System.out.println(bob.getManager());
    }
}

class Employee{
    private String name;
    private String id;
    Employee(String name, String id){
        this.name = name;
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return String.format("Name: %s \n ID: %s", getName(), getId());
    }
}

class Manager extends Employee{
    Manager(String name, String id){
        super(name, id);
    }
}

class Developer extends Employee{
    private Manager manager;
    Developer(String name, String id){
        super(name, id);
    }

    public void setManager(Manager manager){
        this.manager = manager;
    }

    public String getManager(){
        return manager.toString();
    }
}
