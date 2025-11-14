public class DiscountedProduct extends Product {
    private double discount; // у відсотках

    public DiscountedProduct(String name, double price, boolean available, double discount) {
        super(name, price, available);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Метод для розрахунку ціни зі знижкою
    public double getPriceWithDiscount() {
        return getPrice() * (1 - discount / 100);
    }

    @Override
    public void printProductInfo() {
        super.printProductInfo();
        System.out.println("Ціна зі знижкою: " + getPriceWithDiscount());
    }
}


