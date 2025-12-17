public class Main {
    public static void main(String[] args) {
        // Использование перечисления Day с инициализацией элементов
        Day today = Day.MONDAY;
        System.out.println("Сегодня: " + today);

        // Пример switch на основе перечисления
        switch (today) {
            case MONDAY:
                System.out.println("Начало недели!");
                break;
            case FRIDAY:
                System.out.println("Пятница!");
                break;
            default:
                System.out.println("Обычный день.");
        }
    }

    // Перечисление с инициализированными элементами
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
