// Base class
class Shape {
    void area() {
        System.out.println("Area of shape is not defined");
    }
}

// Derived class: Circle
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    // Overriding area() method
    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Overriding area() method
    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class
class Area {
    public static void main(String[] args) {

        // Runtime polymorphism using parent reference
        Shape s;

        s = new Circle(5);
        s.area();      // calls Circle's area()

        s = new Rectangle(4, 6);
        s.area();      // calls Rectangle's area()
    }
}