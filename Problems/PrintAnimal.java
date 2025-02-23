/* Demonstrate method overriding with a base class Animal and subclasses Dog and Cat. */

package Problems;

public class PrintAnimal{
    public static void main(String[] args){
        Animal buddy = new Animal("Buddy");
        Dog spot = new Dog("Spot");
        Cat patches = new Cat("Patches");
        System.out.println(buddy.call());
        System.out.println(spot.call());
        System.out.println(patches.call());        
    }
}

class Animal{
    private String name;
    Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String call(){
        return getName() + " calls";
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    @Override
    public String call(){
        return getName() + " says Bark!";
    }

}

class Cat extends Animal{
    Cat(String name){
        super(name);
    }

    @Override
    public String call(){
        return getName() + " says Meow!";
    }
}