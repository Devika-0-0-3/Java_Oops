//here area of shape overrrides Shape's area with  equilateral_triangle area 
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

class Equilateral_Triangle extends Triangle{
    public void area(){
        System.out.println("Equilateral triangle");
    }
}

public class multilevel{
    public static void main(String args[]){
        Equilateral_Triangle t1=new Equilateral_Triangle();
        t1.area();
    }
}