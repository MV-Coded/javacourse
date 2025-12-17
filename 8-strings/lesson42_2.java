public class Main {
    public static void main(String[] args) {
        // Создание объекта StringBuilder
        StringBuilder sb = new StringBuilder("Начало");

        // 1. append() — добавляет строку в конец
        sb.append(" - продолжение");
        System.out.println("1. append(): " + sb);

        // 2. insert(int offset, String str) — вставляет строку по индексу
        sb.insert(7, "вставка");
        System.out.println("2. insert(): " + sb);

        // 3. delete(int start, int end) — удаляет подстроку
        sb.delete(7, 14); // удаляем "вставка"
        System.out.println("3. delete(): " + sb);

        // 4. reverse() — разворачивает строку
        sb.reverse();
        System.out.println("4. reverse(): " + sb);

        // 5. setLength(int newLength) — изменяет длину строки
        sb.setLength(10);
        System.out.println("5. setLength(10): " + sb);

        // 6. replace(int start, int end, String str) — заменяет подстроку
        sb.replace(0, 5, "Замена");
        System.out.println("6. replace(): " + sb);

        // 7. toString() — преобразует StringBuilder в String
        String result = sb.toString();
        System.out.println("7. toString(): " + result);

        // 8. capacity() — возвращает текущую ёмкость буфера
        System.out.println("8. capacity(): " + sb.capacity());

        // 9. ensureCapacity(int minimumCapacity) — гарантирует минимальную ёмкость
        sb.ensureCapacity(50);
        System.out.println("9. ensureCapacity(50): " + sb.capacity());

        // 10. length() — возвращает текущую длину строки
        System.out.println("10. length(): " + sb.length());
    }
}
