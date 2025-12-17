interface InterfaceA {
    void commonMethod();
}

interface InterfaceB {
    void commonMethod();
}

class ConflictingClass implements InterfaceA, InterfaceB {
    // Класс обязан переопределить общий метод, иначе ошибка компиляции
    @Override
    public void commonMethod() {
        System.out.println("Метод переопределен в классе");
    }
}

public class Main {
    public static void main(String[] args) {
        ConflictingClass obj = new ConflictingClass();
        obj.commonMethod(); // Работает, так как метод переопределен
    }
}
