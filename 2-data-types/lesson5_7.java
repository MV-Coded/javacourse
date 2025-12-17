public class Main {
    public static void main(String[] args) {
        int a = 120;                    // a — переменная типа int, значение 120
        //byte b = a + 10;             // ОШИБКА: нельзя неявно преобразовать int в byte
        byte c = (byte)(a + 10);        // c — byte, (byte)130 = -126 из-за переполнения
        byte d = (byte)(a + 1);         // d — byte, (byte)121 = 121 (в пределах диапазона)

        System.out.println(d);          // Вывод: 121
    }
}
