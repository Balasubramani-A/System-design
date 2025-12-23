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
}


public class oops{
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen1.write();

        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.printInfo();
    }
}