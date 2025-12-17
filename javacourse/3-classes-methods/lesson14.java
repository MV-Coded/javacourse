public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса, чтобы продемонстрировать доступ к его членам
        AccessExample example = new AccessExample();

        // Доступ к публичному полю и методу - разрешен из любого места
        System.out.println("Публичное поле: " + example.publicField);
        example.publicMethod();

        // Доступ к защищенному полю и методу - разрешен только внутри этого же пакета или в подклассах
        // (в данном случае мы в том же пакете, поэтому доступ есть)
        System.out.println("Защищенное поле: " + example.protectedField);
        example.protectedMethod();

        // Доступ к полю с уровнем доступа по умолчанию - разрешен только внутри того же пакета
        System.out.println("Поле по умолчанию: " + example.defaultField);
        example.defaultMethod();

        // Попытка доступа к приватному полю и методу - вызовет ошибку. Например:
        // System.out.println(example.privateField);
        // example.privateMethod(); - вызывают ошибки.

        // Выводим сообщение о невозможности доступа к приватным членам
        System.out.println("Приватные члены недоступны извне класса — это обеспечивает инкапсуляцию.");
    }
}

// Класс для демонстрации спецификаторов доступа
class AccessExample {
    // Приватный член - доступен ТОЛЬКО внутри этого класса
    private String privateField = "Это приватное поле";

    // Член по умолчанию (package-private) - доступен только в пределах пакета
    String defaultField = "Это поле по умолчанию";

    // Защищенный член - доступен в этом же пакете и в подклассах
    protected String protectedField = "Это защищенное поле";

    // Публичный член - доступен везде
    public String publicField = "Это публичное поле";

    // Приватный метод - доступен ТОЛЬКО внутри этого класса
    private void privateMethod() {
        System.out.println("Вызван приватный метод");
    }

    // Метод по умолчанию - доступен только в пределах пакета
    void defaultMethod() {
        System.out.println("Вызван метод по умолчанию");
    }

    // Защищенный метод - доступен в этом же пакете и в подклассах
    protected void protectedMethod() {
        System.out.println("Вызван защищенный метод");
    }

    // Публичный метод - доступен везде
    public void publicMethod() {
        System.out.println("Вызван публичный метод");
    }
}
