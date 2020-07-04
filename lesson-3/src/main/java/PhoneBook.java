import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, Person> phoneBook = new HashMap<>();

    public PhoneBook() {
    }

    public void PrintBook() {
        for (Map.Entry<String, Person> o : phoneBook.entrySet()) {
            System.out.println(o.getKey() + ": " + ((Person) o.getValue()).getEmail() + ", " + ((Person) o.getValue()).getPhone());
        }
    }

    public void addPerson(String lastName, Person person) {
        if (this.phoneBook.containsKey(lastName)) {
            System.out.println("Запись не создана, так как такая фамилия уже есть в телефонной книге. Фамилия = " + lastName);
        } else {
            this.phoneBook.put(lastName, person);
        }
    }

    public ArrayList getPhone(String lastName) {
        return ((Person) this.phoneBook.get(lastName)).getPhone();
    }

    public String getEmail(String lastName) {
        return ((Person) this.phoneBook.get(lastName)).getEmail();
    }
}
