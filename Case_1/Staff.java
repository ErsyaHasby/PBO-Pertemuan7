public class Staff {
    private StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[8];  // ubah ke 8

        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469",
                "123-45-6789", 2423.07);

        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101",
                "987-65-4321", 1246.15);

        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000",
                "010-20-3040", 1169.23);

        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690",
                "958-47-3625", 10.55);

        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");

        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");

        // Tambahan Commission Employee 1
        Commission c1 = new Commission("Alice", "111 First St", "555-1111",
                "111-11-1111", 6.25, 0.20);
        c1.addHours(35);
        c1.addSales(400);
        staffList[6] = c1;

        // Tambahan Commission Employee 2
        Commission c2 = new Commission("Bob", "222 Second St", "555-2222",
                "222-22-2222", 9.75, 0.15);
        c2.addHours(40);
        c2.addSales(950);
        staffList[7] = c2;
    }

    public void payday() {
        double amount;

        for (StaffMember staffMember : staffList) {
            System.out.println(staffMember);
            amount = staffMember.pay();  // polymorphism bekerja di sini

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
