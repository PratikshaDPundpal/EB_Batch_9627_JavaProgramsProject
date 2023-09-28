package programsproject;

abstract class Shape {
    String color;
    
    Shape(String color) {
        this.color = color;
    }
    
    abstract double calculateArea();
    
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


interface Drawable {
    void draw();
}

class Square implements Drawable {
    double side;
    
    Square(double side) {
        this.side = side;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}


public class AbstractandInterface {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Square square = new Square(4.0);
        
        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());
        
        square.draw();
        System.out.println("Square Side Length: " + square.side);
    }
}
