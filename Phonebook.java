import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Phonebook {

    public static void main(String[] args) {
        final int CAPACITY = 100;
        PhonebookEntry[] phonebook = new PhonebookEntry[CAPACITY];
        int entryCount = 0;

        try {
            File file = new File("phonebook.text");
            Scanner infile = new Scanner(file);

            while (infile.hasNext() && entryCount < CAPACITY) {
                phonebook[entryCount] = new PhonebookEntry();
                phonebook[entryCount].read(infile);
                entryCount++;
            }

            if (infile.hasNext()) {
                throw new Exception("*** Exception *** Phonebook capacity exceeded - increase size of underlying array");
            }

            infile.close();

            Scanner keyboard = new Scanner(System.in);
            performLookups(phonebook, entryCount, keyboard);
            keyboard.close();

        } catch (FileNotFoundException e) {
            System.out.println("*** IOException *** phonebook.text (No such file or directory)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void performLookups(PhonebookEntry[] phonebook, int entryCount, Scanner scanner) {
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
                Name searchName = new Name();
                searchName.firstName = firstName;
                searchName.lastName = lastName;
                int index = lookup(phonebook, entryCount, searchName);
                if (index != -1) {
                    System.out.println(phonebook[index].toString());
                } else {
                    System.out.println("-- Name not found");
                }
                System.out.println();
            } else if (input.equals("r")) {
                System.out.print("phone number ((nnn)nnn-nnnn)? ");
                String phoneNumber = scanner.nextLine();
                reverseLookupCount++;
                PhoneNumber searchNumber = new PhoneNumber();
                searchNumber.phoneNumber = phoneNumber;
                int index = reverseLookup(phonebook, entryCount, searchNumber);
                if (index != -1) {
                    System.out.println(phoneNumber + " belongs to " + phonebook[index].name.toString());
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

    public static int lookup(PhonebookEntry[] phonebook, int entryCount, Name searchName) {
        for (int i = 0; i < entryCount; i++) {
            if (phonebook[i].name.equals(searchName)) {
                return i;
            }
        }
        return -1;
    }

    public static int reverseLookup(PhonebookEntry[] phonebook, int entryCount, PhoneNumber searchNumber) {
        for (int i = 0; i < entryCount; i++) {
            if (phonebook[i].phoneNumber.equals(searchNumber)) {
                return i;
            }
        }
        return -1;
    }
}
