import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class PhoneBook {
    private Map<String, List<String>> directory;

    public PhoneBook() {
        directory = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (directory.containsKey(surname)) {
            directory.get(surname).add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            directory.put(surname, phoneNumbers);
        }
    }

    public List<String> get(String surname) {

        return directory.getOrDefault(surname, new ArrayList<>());
    }

    public void printEntries() {
        System.out.println("telephoneBook entries:");
        for (String surname : directory.keySet()) {
            ArrayList<String> phoneNumbers = (ArrayList<String>) directory.get(surname);
            System.out.print(surname + ": ");
            for (String phoneNumber : phoneNumbers) {
                System.out.print(phoneNumber + " ");
            }
            System.out.println();
        }
    }
}

public class Lesson_8 {
    public static void main(String[] args) {
        String[] strings = {"Поле", "Река", "Небо", "Класс", "Поле", "Город", "Река", "Лес", "Дорога", "Город",
                "Деревня", "Озеро", "Мост", "Овраг", "Поле"};

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : strings) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("Уникальные слова и количество их встречаемости:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "+123456789");
        phoneBook.add("Petrov", "+111111111");
        phoneBook.add("Sidorov", "+987654321");
        phoneBook.add("Ivanov", "+2222222222");
        phoneBook.printEntries();

    }
}