public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр перечисления и вызываем его метод
        Color favoriteColor = Color.BLUE;
        System.out.println(favoriteColor.getName()); // Выводит: Синий
        System.out.println(favoriteColor.getHexCode()); // Выводит: #0000FF
    }

    // Собственное перечисление с дополнительным методом
    enum Color {
        RED("Красный", "#FF0000"),
        GREEN("Зеленый", "#00FF00"),
        BLUE("Синий", "#0000FF");

        // Поля для хранения данных
        private final String name;
        private final String hexCode;

        // Конструктор перечисления (вызывается при создании каждого элемента)
        Color(String name, String hexCode) {
            this.name = name;
            this.hexCode = hexCode;
        }

        // Дополнительный метод
        public String getName() {
            return name;
        }

        public String getHexCode() {
            return hexCode;
        }
    }
}
