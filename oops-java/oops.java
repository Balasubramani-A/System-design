class Pen{
    String color;
    String type; //ballpoint, gel, fountain etc.

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    
}

class Student{//by connvension, class name always starts with capital letter while function and variable names start with small letter
    String name;
    int age;
    int grade;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.grade);
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    Student(Student s1){ //copy constructor
        this.name = s1.name;
        this.age = s1.age;
        this.grade = s1.grade;
    }  
    Student(){

    } 
}


public class oops{
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        // pen1.write();

        Student s1 = new Student();
        s1.name = "Balu";
        s1.age = 20;
        s1.grade = 3;
        // s1.printInfo();

        Student s2 = new Student(s1);//copy constructor
        s2.printInfo();
    }
}