import java.util.Scanner;

class PhoneNumber {
    String phoneNumber;

    void read(Scanner scanner) {
        phoneNumber = scanner.next();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PhoneNumber that = (PhoneNumber) obj;
        return phoneNumber.equals(that.phoneNumber);
    }

    @Override
    public String toString() {
        return phoneNumber;
    }
}
