import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Практика #2 ===");

        // Создаем массив для демонстрации методов
        int[] numbers = {5, 2, 8, 1, 9, 3};

        // toString(...) - преобразует массив в строковое представление
        // Важно: используется Arrays.toString() для удобного вывода
        System.out.println("Массив как строка: " + Arrays.toString(numbers));

        // sort(...) - сортирует массив по возрастанию
        Arrays.sort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));

        // binarySearch(...) - бинарный поиск (работает только с отсортированным массивом)
        // Возвращает индекс найденного элемента или отрицательное значение, если не найден
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Индекс числа 5: " + index); // Должен быть 2

        // equals(...) - сравнивает два массива на равенство
        int[] numbers2 = {1, 2, 3, 5, 8, 9};
        boolean areEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Массивы равны? " + areEqual); // true

        // compare(...) - сравнивает два массива лексикографически (Java 9+)
        // Возвращает 0, если равны; отрицательное, если первый меньше; положительное, если первый больше
        int comparisonResult = Arrays.compare(numbers, numbers2);
        System.out.println("Результат сравнения: " + comparisonResult); // 0, так как равны
    }
}
