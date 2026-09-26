class Shape {
    public void area() {
        System.out.println("displayed area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {

        System.out.println(.5 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Oops {
    public static void main(String args[]) {
        Triangle t = new Triangle();
        t.area(10, 5);

        Circle c = new Circle();
        c.area(2);
    }
}