public class WeeklySales {
    public static void main(String[] args) {
        SalesPerson[] staff = {
            new SalesPerson("John", "Smith", 300),
            new SalesPerson("Sue", "Jones", 400),
            new SalesPerson("Bob", "Lewis", 300),
            new SalesPerson("Anne", "Smith", 400),
            new SalesPerson("Paul", "Anderson", 200),
            new SalesPerson("Kate", "Baker", 300)
        };

        System.out.println("Before sorting:");
        for (SalesPerson s : staff)
            System.out.println(s);

        // pakai insertionSort descending
        Sorting.insertionSort(staff);

        System.out.println("\nAfter sorting:");
        for (SalesPerson s : staff)
            System.out.println(s);
    }
}
