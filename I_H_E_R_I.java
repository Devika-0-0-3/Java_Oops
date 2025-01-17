//properties and methods of one class is acquired by another class
//reusability promotes
//base class /parent class -->class from which properties are inherited
//chils class/sub class -->classes which inherits another class properties
//java have 4 inheritance types
///multiple inheritance does not support ie b-->a and c-->a not possible

class Shape{
    String color;

}
class Triangle extends Shape{
    public void show(){
        System.out.println(this.color);
    }
}

public class I_H_E_R_I {
    public static void main(String args[]){
        Triangle t1=new Triangle();
        t1.color="red";
        t1.show();

    }
}
