public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak(); // Вызов метода суперкласса
        dog.speak();    // Вызов переопределённого метода подкласса

        // Попытка создать класс с неверным типом возврата (закомментировано, чтобы не ломать компиляцию)
        // Это приведёт к ошибке компиляции:
        /*
        class InvalidDog extends Animal {
            @Override
            public int speak() { // Ошибка: несовместимый тип возврата (должен быть void)
                System.out.println("Woof!");
                return 0;
            }
        }
        */
    }
}

class Animal {
    public void speak() {
        System.out.println("Animal speaks.");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
