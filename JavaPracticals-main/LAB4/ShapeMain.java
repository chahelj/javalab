abstract class Shape {
    int x, y;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        x = length;
        y = breadth;
    }
    void printArea() {
        System.out.println("Area of Rectangle = " + (x * y));
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        x = base;
        y = height;
    }
    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * x * y));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        x = radius;
    }
    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * x * x));
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10, 5);
        Shape s2 = new Triangle(6, 4);
        Shape s3 = new Circle(7);

        s1.printArea();
        s2.printArea();
        s3.printArea();
    }
}
