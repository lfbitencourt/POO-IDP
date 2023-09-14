public class Triangle {
    private double height;

    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return 0.5 * height * base;
    }

    public double getPerimeter() {
        return 2 * height + base;
    }
}