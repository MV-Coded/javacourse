public class Main {
    public static void main(String[] args) {
	// при объявлении локальной переменной не требуется явно указывать её тип. Компилятор может сам определить статический тип переменной на основе её инициализатора:
        var message = "Hello, Java!";  // тип String выводится автоматически
        var number = 42;               // тип int
        var list = java.util.List.of("a", "b", "c"); // тип List<String>

	// вывод типа
        System.out.println(message);
        System.out.println(number);
        System.out.println(list);
	// существуют также примеры, где var является незаменимым элементом программы:
	//var v = new Runnable() {
	//	void run() { … }
	//	void runTwice() { run(); run(); }
	//};
	//v.runTwice();
    	//}
	// Это фрагмент кода, показывающий пример, в котором var просто нельзя заменить явным типом, т.к. метод runTwice() не сработает:
}
