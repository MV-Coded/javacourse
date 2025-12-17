public class Main {
    public static void main(String[] args) {
        // Создаем объект подкласса
        Dog dog = new Dog();
        
        // Вызываем переопределенный метод из подкласса
        dog.makeSound(); // Вывод: Гав!
        
        // Вызываем перегруженные методы с разными аргументами
        dog.eat("косточку");     // Вывод: Собака ест косточку
        dog.eat("мясо", 2);      // Вывод: Собака ест 2 порции мяса
        
        // Пример метода без return (void)
        dog.sleep();             // Вывод: Собака спит
    }
}

// Суперкласс
class Animal {
    // Переопределяемый метод
    void makeSound() {
        System.out.println("Животное издает звук");
    }
    
    // Перегружаемые методы
    void eat(String food) {
        System.out.println("Животное ест " + food);
    }
    
    // Метод без return (void), можно не писать return
    void sleep() {
        System.out.println("Животное спит");
    }
}

// Подкласс, переопределяющий и перегружающий методы
class Dog extends Animal {
    // Переопределение метода из суперкласса
    @Override
    void makeSound() {
        System.out.println("Гав!");
    }
    
    // Перегрузка метода eat() - другой тип/количество аргументов
    void eat(String food, int portions) {
        System.out.println("Собака ест " + portions + " порции " + food);
    }
    
    // Перегрузка метода eat() - другой тип аргумента
    void eat(String food) {
        System.out.println("Собака ест " + food);
    }
}
