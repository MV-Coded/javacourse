class Parent {
    // Объявляем метод как final - он не может быть переопределен
    public final void display() {
        System.out.println("Final method in Parent class");
    }
}

class Child extends Parent {
    // Попытка переопределить final-метод вызовет ошибку компиляции
    // public void display() {  // Это вызовет ошибку
    //     System.out.println("Trying to override final method");
    // }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объект родительского класса и вызываем final-метод
        Parent parent = new Parent();
        parent.display(); // Выведет: Final method in Parent class

        // Создаем объект дочернего класса - наследование работает, но переопределение нет
        Child child = new Child();
        child.display(); // Выведет: Final method in Parent class (унаследовано без изменений)
        
        // Компилятор не позволит закомментировать код выше и раскомментировать
        // попытку переопределения в классе Child.
    }
}
