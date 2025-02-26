/* - Create an abstract class Shape with an abstract method calculateArea() 
    and implement it in Circle and Square subclasses. */
package Problems;

public class CircleSquare{
    public static void main(String[] args){
        Square square = new Square(5.5);
        Circle circle = new Circle(5.5);
        System.out.println(square);
        System.out.println(circle);
    }
}

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape{
    private double area;
    private double radius;
    Circle(double radius){
        this.radius = radius;
        area = getArea();
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return String.format("Circle\nRadius: %.2f \n Area: %.2f", radius, area);
    }
}

class Square extends Shape{
    private double side;
    private double area;
    Square(double side){
        this.side = side;
        area = getArea();
    }

    public double getSide(){
        return side;
    }

    public double getArea(){
        return Math.pow(side, 2);
    }

    @Override
    public String toString(){
        return String.format("Square\nSide: %.2f \n Area: %.2f", side, area);
    }
}