import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

class PhonebookEntry {
    Name name;
    ArrayList<PhoneNumber> phoneNumbers;

    PhonebookEntry() {
        name = new Name();
        phoneNumbers = new ArrayList<>();
    }

    void read(Scanner scanner) {
        name.read(scanner);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            PhoneNumber newNumber = new PhoneNumber();
            newNumber.read(scanner);
            phoneNumbers.add(newNumber);
        }
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ");
        for (PhoneNumber pn : phoneNumbers) {
            sj.add(pn.toString());
        }
        return name.toString() + "'s phone numbers: [" + sj.toString() + "]";
    }
}
