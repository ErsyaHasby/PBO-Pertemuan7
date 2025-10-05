public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Constructor
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    // Method untuk menambahkan penjualan
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Override pay method
    @Override
    public double pay() {
        double payment = super.pay() + (commissionRate * totalSales);
        totalSales = 0;  // reset setelah gajian
        return payment;
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
