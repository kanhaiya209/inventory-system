import java.util.*;

public class Inventory {

    static Scanner sc = new Scanner(System.in);

    static String[] product;
    static int[] quantity;
    static int size;

    // Add Products
    public static void addStock() {

        for (int i = 0; i < size; i++) {

            if (product[i] == null) {

                System.out.print("Enter Product Name: ");
                product[i] = sc.nextLine();

                System.out.print("Enter Quantity: ");
                quantity[i] = sc.nextInt();
                sc.nextLine();

                System.out.println("Product Added Successfully.");
                return;
            }
        }

        System.out.println("Inventory is Full. Cannot add more products.");
    }

    // View Products
    public static void viewStock() {

        boolean empty = true;

        System.out.println("\n----- Inventory Stock -----");

        for (int i = 0; i < size; i++) {

            if (product[i] != null) {
                System.out.println(
                        (i + 1) + ". Product: " +
                        product[i] +
                        " | Quantity: " +
                        quantity[i]);
                empty = false;
            }
        }

        if (empty) {
            System.out.println("No Products Available.");
        }
    }

    // Reduce Stock
    public static void removeStock() {

        System.out.print("Enter Product Name to Reduce: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (product[i] != null &&
                product[i].equalsIgnoreCase(search)) {

                found = true;

                System.out.print("Enter Quantity to Reduce: ");
                int reduce = sc.nextInt();
                sc.nextLine();

                if (reduce <= quantity[i]) {

                    quantity[i] -= reduce;

                    System.out.println("Stock Reduced Successfully.");
                    System.out.println("Remaining Quantity: " + quantity[i]);

                } else {

                    System.out.println(
                            "Insufficient Stock. Available Quantity: "
                                    + quantity[i]);
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found.");
        }
    }

    // Search Product
    public static void searchStock() {

        System.out.print("Enter Product Name to Search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (product[i] != null &&
                product[i].equalsIgnoreCase(search)) {

                System.out.println("\nProduct Found");
                System.out.println(
                        "Product Name : " + product[i]);
                System.out.println(
                        "Quantity     : " + quantity[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found.");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter Maximum Number of Products: ");
        size = sc.nextInt();
        sc.nextLine();

        product = new String[size];
        quantity = new int[size];

        while (true) {

            System.out.println("\n===== Inventory Menu =====");
            System.out.println("1. View Stock");
            System.out.println("2. Add Stock");
            System.out.println("3. Reduce Stock");
            System.out.println("4. Search Product");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    viewStock();
                    break;

                case 2:
                    addStock();
                    break;

                case 3:
                    removeStock();
                    break;

                case 4:
                    searchStock();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}