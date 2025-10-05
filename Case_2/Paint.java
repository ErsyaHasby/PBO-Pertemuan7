public class Paint {
    private double coverage; // square feet per gallon

    public Paint(double c) {
        coverage = c;
    }

    // Returns the amount of paint (gallons) needed to paint the shape given
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}
