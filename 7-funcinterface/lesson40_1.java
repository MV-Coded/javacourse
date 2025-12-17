
interface ExampleInterface {
    // Неабстрактный метод (default)
    default void defaultMethod() {
        System.out.println("Вызван default метод интерфейса");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Вызван static метод интерфейса");
    }
}

class ExampleClass implements ExampleInterface {
    // Реализация не требуется для default и static методов
}

public class Main {
    public static void main(String[] args) {
        // Вызов default метода через экземпляр класса
        ExampleClass obj = new ExampleClass();
        obj.defaultMethod();

        // Вызов static метода через имя интерфейса
        ExampleInterface.staticMethod();
    }
}
