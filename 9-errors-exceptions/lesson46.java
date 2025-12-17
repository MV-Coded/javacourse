public class Main {
    public static void main(String[] args) {
        // Первое исключение - перехватываем
        try {
            throw new IllegalArgumentException("Первое исключение - перехвачено");
        } catch (IllegalArgumentException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }

        // Второе исключение - приводим к аварийной остановке
        throw new RuntimeException("Второе исключение - аварийная остановка");
    }
}
