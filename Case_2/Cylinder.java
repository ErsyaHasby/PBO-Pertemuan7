public class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    public double area() {
        // surface area = 2πr² + 2πrh
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public String toString() {
        return super.toString() + " with radius " + radius + " and height " + height;
    }
}
