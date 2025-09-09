import java.util.Scanner;

class PhonebookEntry {
    Name name;
    PhoneNumber phoneNumber;

    PhonebookEntry() {
        name = new Name();
        phoneNumber = new PhoneNumber();
    }

    void read(Scanner scanner) {
        name.read(scanner);
        phoneNumber.read(scanner);
    }

    @Override
    public String toString() {
        return name.toString() + "'s phone number is " + phoneNumber.toString();
    }
}
