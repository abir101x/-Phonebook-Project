import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {

    public static void main(String[] args) throws IOException {
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> phoneNumbers = new ArrayList<>();

        // NOTE: This assumes a file named "phonebook.text" is in the same directory.
        File file = new File("phonebook.text");
        Scanner infile = new Scanner(file);
        Scanner keyboard = new Scanner(System.in);
        
        readData(lastNames, firstNames, phoneNumbers, infile);
        performLookups(lastNames, firstNames, phoneNumbers, keyboard);

        keyboard.close();
        infile.close();
    }

    public static void performLookups(ArrayList<String> lastNames, ArrayList<String> firstNames, ArrayList<String> phoneNumbers, Scanner scanner) {
        String input;
        int lookupCount = 0;
        int reverseLookupCount = 0;
        boolean quit = false;

        while (!quit) {
            System.out.print("lookup, reverse-lookup, quit (l/r/q)? ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("l")) {
                System.out.print("last name? ");
                String lastName = scanner.nextLine();
                System.out.print("first name? ");
                String firstName = scanner.nextLine();
                lookupCount++;
                int index = lookup(firstNames, lastNames, firstName, lastName);
                if (index != -1) {
                    System.out.println(firstName + " " + lastName + "'s phone number is " + phoneNumbers.get(index));
                } else {
                    System.out.println("-- Name not found");
                }
                System.out.println();
            } else if (input.equals("r")) {
                System.out.print("phone number (nnn-nnn-nnnn)? ");
                String phoneNumber = scanner.nextLine();
                reverseLookupCount++;
                int index = reverseLookup(phoneNumbers, phoneNumber);
                if (index != -1) {
                    System.out.println(phoneNumber + " belongs to " + firstNames.get(index) + " " + lastNames.get(index));
                } else {
                    System.out.println("-- Phone number not found");
                }
                System.out.println();
            } else if (input.equals("q")) {
                quit = true;
                System.out.println();
            }
        }
        System.out.println(lookupCount + " lookups performed");
        System.out.println(reverseLookupCount + " reverse lookups performed");
    }

    public static void readData(ArrayList<String> lastNames, ArrayList<String> firstNames, ArrayList<String> phoneNumbers, Scanner scanner) throws IOException {
        while (scanner.hasNext()) {
            lastNames.add(scanner.next());
            firstNames.add(scanner.next());
            phoneNumbers.add(scanner.next());
        }
    }

    public static int lookup(ArrayList<String> firstNames, ArrayList<String> lastNames, String firstName, String lastName) {
        for (int i = 0; i < firstNames.size(); i++) {
            if (firstName.equalsIgnoreCase(firstNames.get(i)) && lastName.equalsIgnoreCase(lastNames.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int reverseLookup(ArrayList<String> phoneNumbers, String phoneNumber) {
        for (int i = 0; i < phoneNumbers.size(); i++) {
            if (phoneNumber.equals(phoneNumbers.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
