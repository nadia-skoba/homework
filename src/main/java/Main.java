import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Product phone = new DiscountedProduct("Телефон", 1000, true, 10);
        Product laptop = new DiscountedProduct("Ноутбук", 2500, true, 15);
        Product macbook = new DiscountedProduct("Macbook", 3000, true, 15);

        // Створення списку продуктів
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(phone);
        productList.add(laptop);
        productList.add(macbook);

        System.out.println("Список продуктів:");
        for (Product product : productList) {
            product.printProductInfo();
        }

        // Створення набору категорій
        HashSet<String> categories = new HashSet<>();
        categories.add("Електроніка");
        categories.add("Одяг");
        categories.add("Побутова техніка");

        System.out.println(categories.contains("Одяг"));   // true
        System.out.println(categories.contains("Взуття")); // false

        // Створення список продуктів і цін
        HashMap<String, Double> productPrices = new HashMap<>();
        productPrices.put(phone.getName(), phone.getPrice());
        productPrices.put(laptop.getName(), laptop.getPrice());
        productPrices.put(macbook.getName(), macbook.getPrice());

        System.out.println("Список продуктів і цін:");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println("Продукт: " + entry.getKey() + " Ціна: " + entry.getValue());
        }
    }
}



