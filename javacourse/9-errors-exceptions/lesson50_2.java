public class Main {
    public static void main(String[] args) {
        try {
            // Код, который может вызвать исключение
            System.out.println("Выполняется в блоке try");
        } finally {
            // Этот код выполнится всегда
            System.out.println("Блок finally выполнен");
        }
    }
}
