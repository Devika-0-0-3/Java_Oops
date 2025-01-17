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

    }
   
    
}
