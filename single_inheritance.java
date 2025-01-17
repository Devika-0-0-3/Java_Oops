//overriding here area of triangle overrides area in shape
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);

    }
}

public class single_inheritance {
    public static void main(String args[]){
        Triangle t1=new Triangle();
        t1.area(2,4);
    }
}
