import java.io.FileNotFoundException;
import java.util.Scanner;

class PhonebookApp {

    public static void main(String[] args) {
        try {
            Phonebook phonebook = new Phonebook("phonebook.text");
            performLookups(phonebook);
        } catch (FileNotFoundException e) {
            System.out.println("*** IOException *** phonebook.text (No such file or directory)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void performLookups(Phonebook phonebook) {
        Scanner scanner = new Scanner(System.in);
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
                int index = phonebook.lookup(searchName);
                if (index != -1) {
                    System.out.println(phonebook.getEntry(index).toString());
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
                int index = phonebook.reverseLookup(searchNumber);
                if (index != -1) {
                    System.out.println(phoneNumber + " belongs to " + phonebook.getEntry(index).name.toString());
                } else {
                    System.out.println("-- Phone number not found");
                }
                System.out.println();
            } else if (input.equals("q")) {
                quit = true;
                System.out.println();
            }
        }
        
        scanner.close();
        System.out.println(lookupCount + " lookups performed");
        System.out.println(reverseLookupCount + " reverse lookups performed");
    }
}
