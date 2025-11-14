 public class Product {
        private String name;
        private double price;
        private boolean available;

        public Product(String name, double price, boolean available) {
            this.name = name;
            this.price = price;
            this.available = available;
        }

        // Геттери
        public String getName() { return name; }
        public double getPrice() { return price; }
        public boolean isAvailable() { return available; }

        // Сеттери
        public void setName(String name) { this.name = name; }
        public void setPrice(double price) { this.price = price; }
        public void setAvailable(boolean available) { this.available = available; }

        // Метод для виводу інформації
        public void printProductInfo() {
            System.out.println("Назва: " + name + ", Ціна: " + price + ", Наявність: " + available);
        }
    }

