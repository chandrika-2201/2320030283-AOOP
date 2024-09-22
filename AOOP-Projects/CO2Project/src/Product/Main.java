package Product;



public class Main {
    public static void main(String[] args) {
        // Create an inventory system
        ProductInventory inventory = new ProductInventory();

        // Add products
        inventory.addProduct(new Product(1, "Laptop", 999.99));
        inventory.addProduct(new Product(2, "Phone", 799.99));
        inventory.addProduct(new Product(3, "Tablet", 499.99));
        inventory.addProduct(new Product(4, "Monitor", 199.99));

        // Sort products by price (using Comparable)
        System.out.println("Products sorted by Price:");
        inventory.sortProductsByPrice();
        for (Product product : inventory) {
            System.out.println(product);
        }

        // Sort products by name (using Comparator)
        System.out.println("\nProducts sorted by Name:");
        inventory.sortProductsByName();
        for (Product product : inventory) {
            System.out.println(product);
        }

        // Clone a product
        try {
            Product clonedProduct = inventory.iterator().next().clone();
            System.out.println("\nCloned Product: " + clonedProduct);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
