public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;  // coverage in square feet per gallon

        Paint paint = new Paint(COVERAGE);

        // Instantiate the three shapes
        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        // Compute the amount of paint needed for each
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        // Print the amounts
        System.out.println("Amount of paint needed:");
        System.out.println("Deck: " + deckAmt + " gallons");
        System.out.println("Big Ball: " + ballAmt + " gallons");
        System.out.println("Tank: " + tankAmt + " gallons");
    }
}
