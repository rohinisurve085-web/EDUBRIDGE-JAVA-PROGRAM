
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 5);

        System.out.println("Original Rectangle:");
        rect.display();

        rect.resizeWidth(20);
        rect.resizeHeight(15);

        System.out.println("\nResized Rectangle:");
        rect.display();
    }
}


Output:

//
Original Rectangle:
Width: 10
Height: 5

Resized Rectangle:
Width: 20
Height: 15

  //
