public class Main {
    public static void main(String[] args) {
        try {
            // Код, который может вызвать исключение
            System.out.println("Выполняется в блоке try");
        } finally {
            // Первый блок finally
            System.out.println("Первый блок finally выполнен");
        }
        // Второй блок finally не допустим — ошибка компиляции.
        // Компилятор не позволит иметь два блока finally для одного try.
    }
}
