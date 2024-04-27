

class first{
    String colors;
    String type;

    public void write(){
        System.out.println("im writing");
    }

    public void printColor(){
        System.out.println(this.colors);
    }
}

class student{
    String name;
    int rollNo;

    public void printStudent(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
    }

    // student(String name, int rollNo){
    //     this.name = name;
    //     this.rollNo = rollNo;
    // }

    student(student s2){
        this.name = s2.name;
        this.rollNo = s2.rollNo;
    }

    student(){

    }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int rollNo){
        System.out.println(rollNo);
    }

    public void printInfo(String name, int rollNo){
        System.out.println(name + " " + rollNo);
    }
}

// multi=level inheritance 
class shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Triangel extends shape{
    public void area(int h, int l){
        System.out.println(1/2*l*h);
    }
}

class equilateralTriangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// declaring abstarct keyword
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("creating a new animal");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs ");
    }
}

class Duck extends Animal{
    public void walk(){
        System.out.println(" walks on 2 legs ");
    }
}

public class OOPS {

    public static void main(String args[]){
        first pen1 = new first();
        pen1.colors = "blue";
        pen1.type = "gelPen";

        first pen2 = new first();
        pen2.colors = "red";
        pen2.type = "ballPoint";

        pen1.write();
        pen1.printColor();
        pen2.printColor();

        // student s1 = new student("rohit", 7520);
        student s1 = new student();
        s1.name = "rohit";
        s1.rollNo = 7520;

        // student s2 = new student(s1);
        // s2.printStudent();

        s1.printInfo(s1.name, s1.rollNo);

        Horse h1 = new Horse();
        // h1.walk();

        // Duck d1 = new Duck();
        // d1.walk();

    }

}
