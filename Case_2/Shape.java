public abstract class Shape {
    protected String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    public String toString() {
        return shapeName;
    }

    // abstract method area
    public abstract double area();
}
