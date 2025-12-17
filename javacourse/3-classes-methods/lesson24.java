public class Main {
    public static void main(String[] args) {
        // Пример 1: Перегруженный метод для целых чисел с переменным числом параметров
        printNumbers(1, 2, 3); // Вызов метода с тремя аргументами
        printNumbers(10, 20);   // Вызов метода с двумя аргументами

        // Пример 2: Перегруженный метод для строк с переменным числом параметров
        printStrings("Hello", "World"); // Вызов метода со строками
        printStrings("I","Am","MaximVidnoy"); // Вызов метода с тремя строками

        // Пример 3: Перегруженный метод для смешанных типов (используем Object... для универсальности)
        printObjects("Number:", 42, "Text:", "Example"); // Вызов метода с разными типами данных
    }

    // Метод для вывода целых чисел (первая перегрузка)
    public static void printNumbers(int... numbers) {
        for (int num : numbers) { // Цикл по всем переданным числам
            System.out.println(num);
        }
    }

    // Метод для вывода строк (вторая перегрузка)
    public static void printStrings(String... strings) {
        for (String str : strings) { // Цикл по всем переданным строкам
            System.out.println(str);
        }
    }

    // Метод для вывода любых объектов (третья перегрузка, использует Object...)
    public static void printObjects(Object... objs) {
        for (Object obj : objs) { // Цикл по всем перед
