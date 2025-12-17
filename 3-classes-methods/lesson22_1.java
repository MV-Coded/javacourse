class Wrapper<T> {
    private T item;
    public void setItem(T item) { this.item = item; }
    public T getItem() { return item; }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты с разными типами
        Wrapper<Integer> intWrapper = new Wrapper<>();
        Wrapper<String> stringWrapper = new Wrapper<>();

        // Проверяем тип объекта с помощью instanceof
        // Важно: при использовании instanceof с обобщенными типами,
        // проверяется только "сырой" тип (raw type), так как информация о типе стирается на этапе выполнения (type erasure)
        if (intWrapper instanceof Wrapper) {
            System.out.println("intWrapper - это объект типа Wrapper");
        }

        // Попытка проверить конкретный параметризованный тип (например, Wrapper<Integer>) не сработает в Java
        // Компилятор выдаст ошибку, потому что после стирания типов (type erasure) все обобщенные типы становятся "сырыми"
        // if (intWrapper instanceof Wrapper<Integer>) { ... } // Это вызовет ошибку компиляции

        // Можно проверить, является ли объект экземпляром определенного класса или его подкласса
        if (stringWrapper instanceof Object) {
            System.out.println("stringWrapper - это объект типа Object");
        }

        // Также можно использовать instanceof для проверки, принадлежит ли объект к определенному интерфейсу
        // (если бы Wrapper реализовывал какой-то интерфейс)
    }
}
