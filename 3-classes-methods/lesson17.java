public class Main {
    public static void main(String[] args) {
        // Вариант 1: вызов через имя класса
        A.printVers();

        // Вариант 2: создание экземпляра и вызов через него (плохо)
        A instance = new A();
        instance.printVers();

        // Вариант 3: вызов через экземпляр
        new A().printVers();
    }
}

class A {
    public static int a = 1;
    public static int b;

    public static void printVers() {
        System.out.println(a);
        System.out.println(b);
    }
}
