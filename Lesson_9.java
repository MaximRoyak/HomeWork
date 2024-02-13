import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Lesson_9 {

    public static void main(String[] args) {
        int size = 15; // Размер массива

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }

        System.out.println("Массив случайных чисел:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int evenCount = evenNumbers(numbers);
        System.out.println("Количество чётных чисел: " + evenCount);

        List<String> collection = new ArrayList<>();
        collection.add("Highload");
        collection.add("High");
        collection.add("Load");
        collection.add("Highload");

        int countHigh = countOccurrences(collection, "High");
        System.out.println("Количество раз, когда 'High' встречается в коллекции: " + countHigh);

        String firstElement = getFirstElement(collection);
        System.out.println("Первый элемент: " + firstElement);

        String lastElement = getLastElement(collection);
        System.out.println("Последний элемент: " + lastElement);

        List<String> collect = new ArrayList<>(Arrays.asList("f10", "f15", "f2", "f4", "f4"));

        // Сортировка коллекции по возрастанию с использованием Stream API
        String[] sortedArray = collect.stream()
                .sorted()
                .toArray(String[]::new);

        // Объединение отсортированного массива в одну строку
        String result = String.join(", ", sortedArray);

        // Вывод отсортированной строки
        System.out.println("Отсортированный массив: " + result);

        Scanner scanner = new Scanner(System.in);
        List<String> logins = new ArrayList<>();

        System.out.println("Введите логины (для завершения введите пустую строку):");
        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            logins.add(input);
        }

        System.out.println("Логины, начинающиеся на букву 'f':");
        for (String login : logins) {
            if (login.startsWith("f")) {
                System.out.println(login);
            }
        }

        scanner.close();
    }

    public static int evenNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int countOccurrences(List<String> collection, String element) {
        int count = 0;
        for (String str : collection) {
            if (str.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static String getFirstElement(List<String> collection) {
        if (collection.isEmpty()) {
            return "0";
        } else {
            return collection.get(0);
        }
    }

    public static String getLastElement(List<String> collection) {
        if (collection.isEmpty()) {
            return "0";
        } else {
            return collection.get(collection.size() - 1);
        }
    }
}
