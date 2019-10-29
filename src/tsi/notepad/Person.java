package tsi.notepad;

public class Person extends Record {
    private String name;
    private String surname;
    private String phone;
    private String email;

    @Override
    public void askInfo() {
        name = Asker.askString("Name> ");
        surname = Asker.askString("Surname> ");
        phone = Asker.askString("Phone> ");
        email = Asker.askString("Email> ");
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || name.contains(str)
                || surname.contains(str)
                || phone.contains(str)
                || email.contains(str);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
