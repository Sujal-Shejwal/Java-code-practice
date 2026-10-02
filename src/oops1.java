/*Write a Java program to demonstrate the concept of classes, objects, data members, and methods using a Pen example.
Create a Pen object, set its color and tip size, and print them. */
public class oops1 {

    public static void main(String args[]) {

        Pen p1 = new Pen(); // Create a Pen object

        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen {

    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}