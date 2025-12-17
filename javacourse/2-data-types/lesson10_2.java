public class Main {
    public static void main(String[] args) {

        int value = 2;
        int result = 0;

        switch (value) {
            case 1:
                result = 1;
                break;
            case 2:
                result = 2;   // выполнится
            case 3:
                result = 3;   // выполнится вместе с case 2
		break;
            default:
                result = 0;
        }

        System.out.println("Результат при value = 2: " + result); // выведет 3

        // при value == 2, выполнение заходит в case 2,
        // присваивает result = 2, но break нет, выполнится и result = 3
	// в case 3, только там встречается break.
    }
}
