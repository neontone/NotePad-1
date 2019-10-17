package tsi.notepad;

public class Person {
    private static int counter = 0;
    private int id;
    private String name;
    private String surname;
    private String phone;

    public Person() {
        counter++;
        id = counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
