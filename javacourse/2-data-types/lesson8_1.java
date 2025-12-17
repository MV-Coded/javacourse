public class Main {
    public static void main(String[] args) {
        // Примеры использования Integer.decode()
        Integer dec1 = Integer.decode("123");        // десятичное число
        Integer dec2 = Integer.decode("+123");       // десятичное число с плюсом
        Integer dec3 = Integer.decode("-123");       // отрицательное десятичное число

        Integer hex1 = Integer.decode("0x7B");       // шестнадцатеричное (строчная 'x')
        Integer hex2 = Integer.decode("0X7B");       // шестнадцатеричное (заглавная 'X')
        Integer hex3 = Integer.decode("#7B");        // шестнадцатеричное с решёткой (как в цветах)

        Integer oct1 = Integer.decode("0173");       // восьмеричное число (начинается с 0)

        // Вывод результатов
        System.out.println("dec1 = " + dec1); // 123
        System.out.println("dec2 = " + dec2); // 123
        System.out.println("dec3 = " + dec3); // -123

        System.out.println("hex1 = " + hex1); // 123
        System.out.println("hex2 = " + hex2); // 123
        System.out.println("hex3 = " + hex3); // 123

        System.out.println("oct1 = " + oct1); // 123 (0173 в восьмеричной = 123 в десятичной)
    }
}
