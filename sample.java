//class,objects,this,constructors

class Pen{ 
    //class have data-->string int data stored in it and members->functions 
    //defining blueprint of pen
    String color;
    String type; //ballpoint,gel

    //defining functions they are called methods
    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);//this helps the function to understand which object called it
    }


}
//classname Capital letter
//functionsname small letter
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //constructor for Student class
   
    /* non parametrized constructor
    Student(){
        System.out.println("Constructor called");
    }
        */
    //even if it is not written java bydefault makes a constructor and calls it
    
    /*parametrized constructor 
    Student(String name,int age){
      //object name 
        this.name=name; //parameter name
        this.age=age;
    }
        */
    //copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){}
}



//main function comes under public class
public class sample {
    public static void main(String args[]){
        Pen pen1=new Pen(); //made pen
        pen1.color="blue"; // properties called using . operator
        pen1.type="gel";
         //for function also use .
        pen1.write();

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen2.printColor();
        pen1.printColor();

        
       //Student constructor defined above so when object is created it prints whatever in Student constructor
        //new keyword -->memory heap one space is allocated and there these objects get stored there
        //Student() these are constructors, they construct object
        //3 constructors-->non-parametrized, parametrized constructor, copy constructors(one object is copied and put into another object)
        /*Properties of constructors:
        Classname and constructor name ssame
        They dont return anything and they dont have any return type ,they only construct object
        Constructors can be called once when it is created
        */

        //non-parametrized
        //Student s1=new Student(); 
       // s1.name="Devika";
       // s1.age=40;
       //s1.printInfo()

       //parametrized:
        //Student s2=new Student("Anu",45);
        //s2.printInfo();

        //copy constructor object creation
        Student s1=new Student(); // as there is a copy constructor we should also make a constructor for this also
        s1.name="fafa";
        s1.age=24;

        Student s2=new Student(s1); //copy constructor
        s2.printInfo();




    }
   
    
}
//destructors does need to write  but in c++ it is need to write
//in java it is automatic 
//automatic garbage collection-->if an object is not used in the cod ein further it is deleted
//so we dont write destructors in java it uses garbage collection