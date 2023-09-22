package lernia.java.shapes;

public abstract class Shape implements Comparable<Shape> {

    public double isBiggerThenZero(double x) {
        return x > 0 ? x : (Math.random() * 10);
    }

    abstract double getArea();

    abstract double getPerimeter();

    public static Circle createCircle(double radius) {
        return new Circle(radius);
    }

    public static Rectangle createRectangle(double length, double width) {
        return new Rectangle(length, width);
    }

    public void printArea() {
        System.out.println(this.getArea());
    }
    @Override
    public int compareTo(Shape shape) {
        if (this.getArea() == shape.getArea())
            return 0;
        else if (this.getArea() > shape.getArea())
            return 1;

        return -1;
    }
}
