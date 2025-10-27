import java.util.ArrayList;

public class Calculator {

    //Метод для додавання
    public static int add(int a, int b) {
        return a + b;
    }

    //Метод для ділення
    public static int divide(int d, int f) {
        try {
            return d / f;
        } catch (ArithmeticException e) {
            System.out.println("На нуль ділити не можна!");
            return 0;
        }
    }

    public static void main(String[] args) {


       //Виклик методу додавання
        System.out.println(add(8, 9));

        //Масив із іменами студентів
        String[] students = {"Vlad", "Nadia", "Kate", "Tanya", "Yana"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);

        }
            //ArrayList із містами
            ArrayList<String> city = new ArrayList<>();
            city.add("kyiv");
            city.add("Lviv");
            city.add("Malyn");

            System.out.println(city);

            city.add("Brovary");
            System.out.println(city);


        //Виклик метод ділення
        int result = divide(10, 0);
        System.out.println("result= " + result);

       //Перевірка очікувального та фактичного результату
        String expected = "Login successful";
        String actual = "login successful";

        if (expected.equals( actual) ){
            System.out.println("тест пройдено");
        }else{
            System.out.println("тест не пройдено");
        }
    }
}



