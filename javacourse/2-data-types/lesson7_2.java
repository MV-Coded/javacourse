public class Main {
    public static void main(String[] args) {
        // Примеры использования instanceof с типом String

        // 1. Объект типа String — instanceof возвращает true
        String str = "Тест";
        System.out.println(str instanceof String); // true

        // 2. Переменная типа Object, ссылающаяся на объект String
        Object obj1 = "Это тоже строка";
        System.out.println(obj1 instanceof String); // true

        // 3. Переменная типа Object, ссылающаяся на не-String объект
        Object obj2 = new Integer(42);
        System.out.println(obj2 instanceof String); // false

        // 4. Переменная типа Object, равная null
        Object obj3 = null;
        System.out.println(obj3 instanceof String); // false

        // 5. Переменная типа String, равная null
        String nullStr = null;
        System.out.println(nullStr instanceof String); // false
    }
}
