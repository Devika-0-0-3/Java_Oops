// Pure abstraction means hiding all useless info; only useful info shown via interface
// In interface, constructors cannot be created
// Interface is implemented, not extended (by classes)
// Interface cannot have non-abstract methods (except default/static from Java 8+)

interface Animal {
    void walk();
    void eat();
}

// Class implementing the interface Animal
class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs.");
    }
    public void eat() {
        System.out.println("Horse eats grass.");
    }
}

class Dog implements Animal {
    public void walk() {
        System.out.println("Dog walks on 4 legs.");
    }
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

public class Encap_interface {
    public static void main(String[] args) {
        Animal horse = new Horse();
        horse.walk();
        horse.eat();

        Animal dog = new Dog();
        dog.walk();
        dog.eat();
    }
}
