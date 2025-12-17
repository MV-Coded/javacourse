public class Main {
    public static void main(String[] args) {
        // Операторы присваивания: =, +=, -=, *=, /=, %=
        int a = 10;
        a += 5;   // a = 15
        a -= 3;   // a = 12
        a *= 2;   // a = 24
        a /= 4;   // a = 6
        a %= 5;   // a = 1

        // Тернарный условный оператор ?:
        int b = (a > 0) ? 100 : -100;  // b = 100

        // Логические операторы || (ИЛИ) и && (И)
        boolean cond1 = true, cond2 = false;
        boolean resultOr = cond1 || cond2;   // true
        boolean resultAnd = cond1 && cond2;  // false

        // Побитовые операторы: | (ИЛИ), ^ (исключающее ИЛИ), & (И)
        int x = 5;  // двоичное: 101
        int y = 3;  // двоичное: 011
        int or = x | y;   // 111 = 7
        int xor = x ^ y;  // 110 = 6
        int and = x & y;  // 001 = 1

        // Операторы сравнения: ==, !=, <, <=, >, >=
        boolean eq = (x == y);     // false
        boolean neq = (x != y);    // true
        boolean less = (x < y);    // false
        boolean leq = (x <= y);    // false
        boolean greater = (x > y); // true
        boolean geq = (x >= y);    // true

        // Операторы сдвига: >> (арифметический сдвиг вправо), 
        // >>> (логический сдвиг вправо), << (сдвиг влево)
        int shiftLeft = x << 1;    // 1010 = 10
        int shiftRight = x >> 1;   // 010 = 2
        int shiftRightUnsigned = x >>> 1; // тоже 2 (для положительных чисел)

        // Арифметические операторы: + и -
        int sum = 10 + 3;   // 13
        int diff = 10 - 3;  // 7

        // Арифметические операторы: *, /, %
        int prod = 4 * 3;   // 12
        int div = 10 / 3;   // 3 (целочисленное деление)
        int mod = 10 % 3;   // 1 (остаток от деления)

        // Операторы инкремента и декремента: префиксная и постфиксная формы
        int c = 5;
        int postInc = c++;  // postInc = 5, c становится 6
        int preInc = ++c;   // c становится 7, preInc = 7
        int postDec = c--;  // postDec = 7, c становится 6
        int preDec = --c;   // c становится 5, preDec = 5

        // Унарные операторы: ~ (побитовое НЕ), ! (логическое НЕ)
        int bitwiseNot = ~x;       // ~5 = -6 (дополнение до двух)
        boolean boolNot = !cond1;  // false

        // Операторы группировки ( ) и обращения к элементу массива [ ]
        int grouped = (2 + 3) * 4; // 20
        int[] arr = {1, 2, 3};
        int fromArray = arr[1];    // 2

        // Операторы ==, != и = применимы к любым типам, включая объекты и литералы
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";

        boolean strEq1 = (s1 == s3); // true (один и тот же строковый литерал из пула)
        boolean strEq2 = (s1 == s2); // false (разные объекты в памяти)
        boolean strEq3 = s1.equals(s2); // true (сравнение по содержимому)

        String s4 = "World";
        s4 = "New"; // присваивание нового значения ссылке

        // Конкатенация строк с помощью + и +=
        String concat1 = "Hello" + " " + "Java"; // "Hello Java"
        String concat2 = "Start";
        concat2 += " End"; // "Start End"

        // Сравнение примитивов и ссылок с помощью == и !=
        int num1 = 42;
        int num2 = 42;
        boolean primEq = (num1 == num2); // true

        Object obj1 = new Object();
        Object obj2 = obj1;
        boolean refEq = (obj1 == obj2); // true (один и тот же объект)

        // Вывод - программа успешно завершена
        System.out.println("Готово");
    }
}
