//static methods ,variables can be accessed using class name
//memory fixed for static
class Student{
    String name;
    static String school; //same schol name for all students
    public static void changeSchool(){
        school="CEC";
    }
}

public class Static_Keyword{
    public static void main(String args[]){
        Student.school="AVP";
        Student s1=new Student();
        s1.name="devika";
        Student.changeSchool();
        System.out.println(s1.school);
    }
}