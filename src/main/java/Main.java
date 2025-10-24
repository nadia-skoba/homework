public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = "Nadin";////  створення змінних
        int age = 23;
        double height = 1.70;
        boolean isFast = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(isFast);
        if (age >= 18) { /// / перевірка віку
            System.out.println("Доступ дозволено");
        } else System.out.println("Доступ заборонено");
        String day = "Субота"; ////перевірка дня тижня
        switch (day) {
            case "Понеділок":
            case "Вівторок":
            case "Середа":
            case "Четверг":
            case "П'ятниця":
                System.out.println("Робочий день");
                break;
            case "Субота":
            case "Неділя":
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Такого дня не існує");
        }
        for (int i = 1; i <= 5; i++) { /// //  цикл for
            System.out.println(i);
        }
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("знайдено число" + target + "на позиції" + index);
        } else {
            System.out.println("Число " + target + "не знайдено");
        }
    }
/// /// метод лінійного пошуку
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return target;
    }
}











