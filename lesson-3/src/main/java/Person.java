import java.util.ArrayList;

public class Person {
    private ArrayList phone;
    private String email;

    public Person(ArrayList phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public ArrayList getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
