public class TruckTest {
    public static void main(String[] args) {

        // Test 1: default constructor makes a small truck
        Truck t1 = new Truck();
        System.out.println("Test 1 - Default: " + t1 + "  (expected type: small)");

        // Test 2: invalid type should throw
        try {
            Truck t2 = new Truck("huge");
            System.out.println("Test 2 FAILED - no exception thrown");
        } catch (TruckException e) {
            System.out.println("Test 2 - Caught bad type: " + e.getMessage());
        }

        // Test 3: addPackage returns true when it fits
        try {
            Truck t3 = new Truck("small");
            Pack p = new Pack("Amazon", "A1", new Date(3, 15, 2023), 100, 50);
            boolean added = t3.addPackage(p);
            System.out.println("Test 3 - Added: " + added + "  (expected true)");
        } catch (TruckException | PackException | DateException e) {
            System.out.println("Test 3 FAILED: " + e.getMessage());
        }

        // Test 4: addPackage returns false when over weight limit
        try {
            Truck t4 = new Truck("small");
            Pack p = new Pack("Heavy Co", "B2", new Date(), 2001, 10);
            boolean added = t4.addPackage(p);
            System.out.println("Test 4 - Over weight, added: " + added + "  (expected false)");
        } catch (TruckException | PackException e) {
            System.out.println("Test 4 FAILED: " + e.getMessage());
        }
    }
}
