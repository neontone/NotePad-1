package tsi.notepad;

public class Person extends Record {
    private String name;
    private String surname;
    private String phone;
    private String email;

    @Override
    public void askInfo() {
        System.out.print("Name> ");
        name = Main.scan.next();
        System.out.print("Surname> ");
        surname = Main.scan.next();
        System.out.print("Phone> ");
        phone = Main.scan.next();
        System.out.print("Email> ");
        email = Main.scan.next();
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
