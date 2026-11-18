
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

    void erase() {
        System.out.println("Erasing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Triangle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Square");
    }
}

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(),
            new Triangle(),
            new Square()
        };

        for (Shape s : shapes) {
            s.draw();
            s.erase();
            System.out.println();
        }
    }
}


//
Output:
Drawing a Circle
Erasing a Circle

Drawing a Triangle
Erasing a Triangle

Drawing a Square
Erasing a Square
  //
