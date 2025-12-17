class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(1); // Вызов другого конструктора класса A с одним параметром
    }

    public A(int a) {
        this(a, 2); // Вызов другого конструктора класса A с двумя параметрами
    }

    public A(int a, int b) {
        this(a, b, 3); // Вызов другого конструктора класса A с тремя параметрами
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1; // Инициализация поля z
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();          // Вызывает конструктор по умолчанию
        A obj2 = new A(5);         // Вызывает конструктор с одним параметром
        A obj3 = new A(5, 10);     // Вызывает конструктор с двумя параметрами
        A obj4 = new A(5, 10, 15); // Вызывает конструктор с тремя параметрами

        System.out.println("obj1: a=" + obj1.a + ", b=" + obj1.b + ", c=" + obj1.c + ", z=" + obj1.z);
        System.out.println("obj2: a=" + obj2.a + ", b=" + obj2.b + ", c=" + obj2.c + ", z=" + obj2.z);
        System.out.println("obj3: a=" + obj3.a + ", b=" + obj3.b + ", c=" + obj3.c + ", z=" + obj3.z);
        System.out.println("obj4: a=" + obj4.a + ", b=" + obj4.b + ", c=" + obj4.c + ", z=" + obj4.z);
    }
}
