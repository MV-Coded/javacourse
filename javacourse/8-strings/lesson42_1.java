public class Main {
    public static void main(String[] args) {
        String text = "Привет, Мир!";

        // 1. length() — возвращает длину строки
        System.out.println("1. length(): " + text.length());

        // 2. charAt(int index) — возвращает символ по индексу
        System.out.println("2. charAt(0): " + text.charAt(0));

        // 3. substring(int beginIndex) — возвращает подстроку с указанного индекса
        System.out.println("3. substring(8): " + text.substring(8));

        // 4. substring(int beginIndex, int endIndex) — возвращает подстроку между индексами
        System.out.println("4. substring(0, 7): " + text.substring(0, 7));

        // 5. toUpperCase() — переводит строку в верхний регистр
        System.out.println("5. toUpperCase(): " + text.toUpperCase());

        // 6. toLowerCase() — переводит строку в нижний регистр
        System.out.println("6. toLowerCase(): " + text.toLowerCase());

        // 7. indexOf(String str) — возвращает индекс первого вхождения подстроки
        System.out.println("7. indexOf(\"Мир\"): " + text.indexOf("Мир"));

        // 8. contains(CharSequence s) — проверяет, содержит ли строка указанную последовательность
        System.out.println("8. contains(\"Привет\"): " + text.contains("Привет"));

        // 9. startsWith(String prefix) — проверяет, начинается ли строка с указанного префикса
        System.out.println("9. startsWith(\"Привет\"): " + text.startsWith("Привет"));

        // 10. endsWith(String suffix) — проверяет, заканчивается ли строка указанным суффиксом
        System.out.println("10. endsWith(\"!\"): " + text.endsWith("!"));
    }
}
