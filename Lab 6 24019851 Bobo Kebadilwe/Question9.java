public class Question9 {

    static class Shape {
        // Overload 1: no arguments
        void draw() {
            System.out.println("Drawing a generic shape.");
        }

        // Overload 2: takes a color
        void draw(String color) {
            System.out.println("Drawing a " + color + " shape.");
        }
    }

    // Subclass overrides only the no-argument draw()
    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a circle.");
        }
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();          // generic shape
        s.draw("red");     // overloaded version

        Circle c = new Circle();
        c.draw();          // overridden version (circle-specific)
        c.draw("blue");    // inherited overload, not overridden, so still prints "shape"
    }
}