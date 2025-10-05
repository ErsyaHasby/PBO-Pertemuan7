public class SalesPerson implements Comparable<SalesPerson> {
    private String firstName, lastName;
    private int totalSales;

    public SalesPerson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }

    public int getSales() {
        return totalSales;
    }

    public String getName() {
        return lastName + ", " + firstName;
    }

    //--------------------------------------------------------------
    // compareTo: based on sales (descending), tie-breaker by name (reverse alphabetical)
    //--------------------------------------------------------------
    public int compareTo(SalesPerson other) {
        if (this.totalSales != other.totalSales)
            return this.totalSales - other.totalSales; // lebih besar → positif
        else
            return other.getName().compareTo(this.getName()); // reverse alphabetical
    }
}
