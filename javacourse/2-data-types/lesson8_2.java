public class Main {
    public static void main(String[] args) {
        // Способы создания экземпляра класса Boolean с использованием valueOf
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf(false);
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf("false");
        Boolean bool5 = Boolean.valueOf("TRUE");   // case-insensitive
        Boolean bool6 = Boolean.valueOf("False");  // case-insensitive
        Boolean bool7 = Boolean.valueOf("any other string"); // возвращает false

        // Способы создания экземпляра класса Boolean с использованием parseBoolean
        // Метод parseBoolean возвращает примитив boolean, но его можно автоупаковать в Boolean
        Boolean bool8 = Boolean.parseBoolean("true");
        Boolean bool9 = Boolean.parseBoolean("false");
        Boolean bool10 = Boolean.parseBoolean("random");
    }
}
