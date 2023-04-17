import java.util.Scanner;

class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape...");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square...");
    }
}

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a shape (circle or square): ");
        String shapeType = scanner.nextLine().toLowerCase();

        Shape shape;

        if (shapeType.equals("circle")) {
            shape = new Circle();
        } else if (shapeType.equals("square")) {
            shape = new Square();
        } else {
            System.out.println("Invalid shape type!");
            return;
        }

        shape.draw();
    }
}
