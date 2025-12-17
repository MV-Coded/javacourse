public class Main {
    public static void main(String[] args) {
        // Используем цикл for для демонстрации break и continue
        System.out.println("\nЦикл for с break и continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Пропускаем число 3 с помощью continue");
                continue; // Пропускаем текущую итерацию
            }
            if (i == 7) {
                System.out.println("Останавливаем цикл на числе 7 с помощью break");
                break; // Выходим из цикла
            }
            System.out.print(i + " ");
        }
    }
}
