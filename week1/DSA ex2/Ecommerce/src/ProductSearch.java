import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    public static Product linearSearch(Product[] products, String target) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(target)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String target) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = products[mid].productName.compareToIgnoreCase(target);

            if (result == 0) return products[mid];
            else if (result < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Phone", "Electronics"),
                new Product(2, "Shoes", "Footwear"),
                new Product(3, "Book", "Education"),
                new Product(4, "Laptop", "Electronics"),
                new Product(5, "Shirt", "Clothing")
        };

        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, "Phone");
        System.out.println(result1 != null ? result1.productName : "Not Found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(products, "Phone");
        System.out.println(result2 != null ? result2.productName : "Not Found");
    }
}

