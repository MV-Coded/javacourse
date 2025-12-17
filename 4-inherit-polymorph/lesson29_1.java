public class Main {
    public static void main(String[] args) {
        // Примеры вызова перегруженных методов
        System.out.println(add(5, 3));           // int + int
        System.out.println(add(5.5, 3.2));       // double + double
        System.out.println(add("Hello, ", "World!")); // String + String
    }

    // Перегруженный метод для сложения целых чисел
    public static int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения вещественных чисел
    public static double add(double a, double b) {
        return a + b;
    }

    // Перегруженный метод для конкатенации строк
    public static String add(String a, String b) {
        return a + b;
    }
}
