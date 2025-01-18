//pure abstraction means hides all useless information , only useful information will be shown to users and is done using interface
//in interface, constructor cannot be created
//interface is implemented in java not extended
//interface cannot have non abstract methods
//all methods should be implemented
//if not all the methods are implemented classmust be masrked as abstract
interface  Animal{
     void walk();
     void eat();
}

class Horse implements Animal{
    public void walk(){ //public needs to be written in front 
        System.out.println("Walks on 4 legs");
    }
    public void eat(){
        System.out.println("Horse eats");
    }
    
}

public class Encap_interface {
    public static void main(String args[]){
        Horse h1=new Horse();
        h1.walk();
        h1.eat();
    }
}

/*
 * all the fields are public, static,final
 * methods are public and abstract
 * multiple inheritance possible with interface
 * class Horse implements Animals,Herbivore{}
 */

