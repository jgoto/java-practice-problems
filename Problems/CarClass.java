/* Create a Car class with fields like model, make, and year, 
and methods to display details. */
package Problems;

public class CarClass {
    public static void main(String[] args){
        Car myCar = new Car("Toyota", "Camry",2013);        
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println(myCar);
    }
}

class Car{
    private String model;
    private String make;
    private int year;

    Car(String mk, String mdl, int yr){
        this.model = mdl;
        this.make = mk;
        this.year = yr;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString(){
        return String.format("Car: %d %s %s", year, make, model);
    }
}
