import java.util.Scanner;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class abs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Circle();
        shape.draw();
        scanner.close();
    }
}