class A {
    int a;
    void method() {
        System.out.println("Метод класса A");
    }
}

class B extends A {
    // Конструктор и метод не определены в B, но наследуются от A
}

class C extends B {
    void method() {
        int x = super.a;     // Доступ к полю суперкласса (наследовано от A через B)
        super.method();      // Вызов метода суперкласса (наследовано от A через B)
        System.out.println("Метод класса C, значение поля a: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.method();
    }
}
