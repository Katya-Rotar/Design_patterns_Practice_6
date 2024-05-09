package Part3.Task_6;

import Part2.Task_15.Circle;
import Part2.Task_15.Rectangle;
import Part2.Task_15.Shape;

public class Task {
    public double calculateArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getLength() * rectangle.getWidth();
        } else {
            throw new IllegalArgumentException("Unsupported shape type");
        }
    }

}
