import java.util.Scanner;

class PhoneNumber {
    String description;
    String number;

    void read(Scanner scanner) {
        description = scanner.next();
        number = scanner.next();
    }

    @Override
    public String toString() {
        return description + ": " + number;
    }
}
