//wrapping up of data memebers and member functions and it is put in a class it is termed as encapsulation
//data hiding using access modifiers
//abstraction-->hiding the implementation details and showing only important parts to the user
//data hiding-->process protecting members of class from unintended changes
//abstraction implemented in two ways:abstract class /keyword/functions/properties and interface
//abstract concept is there but not used.. it can have abstract and non abstract methods 

abstract class Animal{
   abstract public void walk();//no need of definition
   //constructir can be created
   Animal(){
    System.out.println("You are creating an animal");
   }
   public void eat(){
    System.out.println("Animal eats");
}
    
}

class Horse extends Animal{
    Horse(){
        System.out.println("You are creating a Horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
   
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class Encap_abstract{
    public static void main(String arg[]){
        Horse h1=new Horse();
        h1.walk();
        h1.eat();
        //animal.walk();
        //object cannot be createdd for abstract methods
        //runtime error
    }
    
}
/*
 An abstract class must be declared with an abstract keyword
It can have abstract and non-abstract methods
It cannot be instantiated
It can have constructors and static methods
It can have final methods which will force the subclass not to change the body of the methods
 */
//constructor chaining when constructor is made in inheritance it first prints from base class constructor then subclass then calledd methods
