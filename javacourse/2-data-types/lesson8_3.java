public class Main {
    public static void main(String[] args) {
        // Пример, когда будет выброшено NullPointerException при автораспаковке
        Integer nullableInteger = null;
        int primitiveInt = nullableInteger; // NullPointerException при автораспаковке

        // Пояснение:
        // Исключение NullPointerException бросается при автораспаковке (unboxing),
        // когда объект-оболочка имеет значение null.
        // Во время автораспаковки JVM пытается вызвать метод intValue() у объекта Integer,
        // но если объект равен null, то происходит NullPointerException.
        // При автоупаковке (boxing) исключение не возникает, даже если присваивается null,
        // так как null — допустимое значение для ссылочного типа.
    }
}
