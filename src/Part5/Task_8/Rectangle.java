package Part5.Task_8;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculateArea() {
        return width * height;
    }
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}