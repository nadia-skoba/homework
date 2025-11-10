public class Main {

    public static void main(String[] args) {

        DiscountedProduct phone = new DiscountedProduct("Phone", 40000, true, 0.10);
        DiscountedProduct macbook = new DiscountedProduct("MacBook", 60000, true, 0.15);

        System.out.println("Product: " + phone.getName());
        System.out.println("Original price: " + phone.getPrice());
        System.out.println("Price with discount: " + phone.getPriceWithDiscount());
        System.out.println("Available: " + phone.isAvailable());

        System.out.println();

        System.out.println("Product: " + macbook.getName());
        System.out.println("Original price: " + macbook.getPrice());
        System.out.println("Price with discount: " + macbook.getPriceWithDiscount());
        System.out.println("Available: " + macbook.isAvailable());

        System.out.println();

        User user1 = new Admin();
        User user2 = new Customer();

        System.out.println(user1.getRole());
        System.out.println(user2.getRole());
    }
}




