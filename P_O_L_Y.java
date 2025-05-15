//poly means many
//morphism means form
//one thing is done in different ways in java
//functional overloading and function overridding
//compile and run time polymorphism
//here we explain compile time polymorphism(function overloading)
//runtime polymorphism explained in inheritance(function overridding)
//method overloading --->different functions with same name but different parameters

class Student{
    String name;
    int age;

    //overloading-->function with name created in same class
    public void printInfo(String name){
        System.out.println(this.name);
    }

    public void printInfo(int age){
        System.out.println(this.age);
    }

    public void printInfo(String name,int age){
        System.out.println(name+ " "+age);
    }

   

}
public class P_O_L_Y
{
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Alak";
        s1.age=24;
        s1.printInfo(s1.name,s1.age);
    }
}
/*
Overloading implementation rules
It should have differentiating factors in the functions
Different return type
Different datatype of parameters
Different no. of parameters
So it is called compile time polymorphism ie it detect if there is any problem during compile time
*/


//public--access method
//static--method belongs to a class not an object 
//void-- no return type
//main--name of the method
//String args[]--it hold command line arguments 