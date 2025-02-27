/* Demonstrate the use of super keyword in constructor chaining. */

package Problems;

public class ConstructorChain{
    public static void main(String[] args){
        Food hamburger = new Food ("Hamburger");
        Food cheeseburger = new Food("Cheeseburger", 2);
        Fruit apple = new Fruit("Apple", 4);
        Fruit peach = new Fruit("Peach");
        System.out.println(hamburger);
        System.out.println(cheeseburger);
        System.out.println(apple);
        System.out.println(peach);
    }
}

class Food {
    public String name;
    public int quantity;
    Food(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    Food(String name){
        this(name, 1);
    }

    @Override
    public String toString(){
        return quantity + " " + name;
    }
}

class Fruit extends Food{
    Fruit(String name, int quantity){
        super(name, quantity);
    }
    Fruit(String name){
        super(name);
    }

    @Override
    public String toString(){
        return "Fruit: " + quantity + " " + name;
    }
}