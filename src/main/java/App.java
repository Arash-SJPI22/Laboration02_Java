import lernia.java.shapes.Shape;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<>();
        Set<Shape> shapeSet = new HashSet<>();

        shapeList.add(Shape.createCircle(4));
        shapeList.add(Shape.createRectangle(2.2, 2.5));
        shapeList.add(Shape.createRectangle(5, 19));
        shapeList.add(Shape.createCircle(19.2));
        shapeList.add(Shape.createCircle(2.2));
        shapeList.add(Shape.createCircle(2.2));
        shapeList.add(Shape.createRectangle(5, 19));

        //Sort list
        shapeList.sort(Shape::compareTo);
        System.out.println("\nPrinting sorted list of shapes from the ArrayList:");
        for (Shape s : shapeList) {
            shapeSet.add(s);
            s.printArea();
        }

        System.out.println("\nPrinting shapes from the Set:");

        for (Shape s : shapeSet) {
            s.printArea();
        }
    }
}
