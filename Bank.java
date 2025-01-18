//built-in packages and user defined packages
//Ensure the package declaration at the top of each file matches the folder name.
//use lowecase for packages
// package <package-name>
//java package require the folder structure to match the package declaration exactly
//import <package-name> to access public methods in the package 
//scanner is a package class import from java.util.* ie java.util is a package

//Access mmodifiers 4 types in java
//default-->not specified. Only within the same package .Package-private 
//public-->can be accessed from anywhere ie within same class, package, subclass or any other package. Make a memeber universally accessible
//private-->only inside a class to access it we use getters and setters. Accessible only within the same class
//protected-->Within same package, in subclass even if they are in different package. Not accessible from a nonsubclass in another package
package bank;

class Account{
    public String name;
    int age;
    protected String place;
    private String password;

    //getters
    public String getPassword(){
        setPassword("randomPass");
        return this.password;
    }
    //setters
    private void setPassword(String pass){
        this.password=pass;
    
    }
}

public class Bank {
    public static void main(String args[]){
        Account a1=new Account();
        a1.name="First";
        a1.age=22;
        a1.place="PTA";
        //a1.password="hihi"; not possible as it is private
        //a1.setPassword("heyhi");
        System.out.println(a1.getPassword());
    }
    
}
