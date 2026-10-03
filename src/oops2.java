// Write a Java program to demonstrate a Constructor.
class Student {
    String name;
    int roll;

    // Constructor
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}

public class oops2 {
    public static void main(String[] args) {

        Student s1 = new Student("altamash", 101);

        s1.display();
    }
}