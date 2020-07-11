import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String text = new String("Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов), и отдельный метод для поиска e-mail по фамилии.");
        text = text.replaceAll("[^\\a-zA-Zа-яёА-ЯЁ ]", "");

        String[] words;
        words = text.split(" ");

        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String itWord : words) {
            if (wordsCount.containsKey(itWord)) {
                wordsCount.put(itWord, wordsCount.get(itWord) + 1);
            } else {
                wordsCount.put(itWord, 1);
            }
        }

        for (Map.Entry<String, Integer> o : wordsCount.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }

        System.out.println();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson("Иванов", new Person(new ArrayList<>(Arrays.asList("8-800-111-11-11", "8-800-222-22-22")), "email@email.com"));
        phoneBook.addPerson("Иванов", new Person(new ArrayList<>(Arrays.asList("8-800-111-11-11")), "email@email.com"));
        phoneBook.addPerson("Петров", new Person(new ArrayList<>(Arrays.asList("8-800-222-11-22")), "email3@email.com"));

        phoneBook.PrintBook();

        System.out.println();
        System.out.println("Запрос номера телефона по фамилии: Иванов");
        System.out.println(phoneBook.getPhone("Иванов"));

        System.out.println();
        System.out.println("Запрос email по фамилии: Иванов");
        System.out.println(phoneBook.getEmail("Иванов"));
    }
}
