import java.util.Objects;
import java.util.Scanner;

class Name {
    String firstName;
    String lastName;

    void read(Scanner scanner) {
        lastName = scanner.next();
        firstName = scanner.next();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Name name = (Name) obj;
        return firstName.equalsIgnoreCase(name.firstName) && lastName.equalsIgnoreCase(name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
