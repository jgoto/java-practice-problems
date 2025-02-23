/* Create a Rectangle class with a constructor and methods to calculate area and perimeter. */

package Problems;
import java.util.Scanner;

public class RectangleCalc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle: ");
        double length = scan.nextDouble();
        System.out.println("Enter the widtht of your rectangle: ");
        double width = scan.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        System.out.println("Your rectangle has an area of " + rect.getArea() + 
            " and a perimeter of " + rect.getPerimeter());
        scan.close();
    }
    
}

class Rectangle{
    private double length;
    private double width;

    Rectangle(double l, double w){
        this.length=l;
        this.width=w;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return ((length * 2) + (width * 2));
    }
}