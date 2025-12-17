class Main {
    public static void main(String[] args) {
        // Пример демонстрации всех вариантов использования ключевого слова super

        // 1. Обращение к конструктору суперкласса
        Child child = new Child(10, "ChildName");

        // 2. Доступ к полю суперкласса
        System.out.println("Поле суперкласса (через super): " + child.getSuperField());

        // 3. Доступ к методу суперкласса
        child.callParentMethod();
    }
}

// Суперкласс
class Parent {
    protected String name;

    public Parent(String name) {
        this.name = name;
        System.out.println("Конструктор Parent: " + name);
    }

    public void display() {
        System.out.println("Метод родителя: " + name);
    }
}

// Подкласс
class Child extends Parent {
    private int value;

    // Конструктор подкласса, использующий super() для вызова конструктора суперкласса
    public Child(int value, String name) {
        super(name); // Обращение к конструктору суперкласса
        this.value = value;
    }

    // Метод, использующий super для доступа к методу суперкласса
    public void callParentMethod() {
        super.display(); // Доступ к методу суперкласса
    }

    // Метод, использующий super для доступа к полю суперкласса
    public String getSuperField() {
        return super.name; // Доступ к полю суперкласса
    }
}
