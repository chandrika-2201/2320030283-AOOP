package Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator; // Import the Comparator class

public class ProductInventory implements Iterable<Product> {
    private List<Product> products;

    // Constructor
    public ProductInventory() {
        products = new ArrayList<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    // Sort products using Comparable (by price)
    public void sortProductsByPrice() {
        Collections.sort(products);
    }

    // Sort products using a Comparator (by name)
    public void sortProductsByName() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
    }

    // Implement Iterator to iterate over the products
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
