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
    //non-parametrized constructor
    /* non parametrized constructor
    Student(){
        System.out.println("Constructor called");
    }
        */
    //even if it is not written java bydefault makes a constructor and calls it

    Student(String name,int age){
      //object name 
        this.name=name; //parameter name
        this.age=age;
    }
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

        //Student s1=new Student(); 
       //Student constructor defined above so when object is created it prints whatever in Student constructor
        //new keyword -->memory heap one space is allocated and there these objects get stored there
        //Student() these are constructors, they construct object
        //3 constructors-->non-parametrized, parametrized constructor, 
        /*Properties of constructors:
        Classname and constructor name ssame
        They dont return anything and they dont have any return type ,they only construct object
        Constructors can be called once when it is created
        */

       // s1.name="Devika";
       // s1.age=40;
       //parametrized:
        Student s2=new Student("Anu",45);
        s2.printInfo();


    }
   
    
}
