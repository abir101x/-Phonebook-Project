import java.util.Scanner;

class PhonebookApp {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: PhonebookApp phonebook-filename");
            return;
        }

        try {
            Phonebook phonebook = new Phonebook(args[0]);
            performLookups(phonebook);
        } catch (Exception e) {
            System.out.println("Error reading phonebook file: " + e.getMessage());
        }
    }

    public static void performLookups(Phonebook phonebook) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean quit = false;

        while (!quit) {
            System.out.print("lookup, quit (l/q)? ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("l")) {
                System.out.print("last name? ");
                String lastName = scanner.nextLine();
                System.out.print("first name? ");
                String firstName = scanner.nextLine();
                
                Name searchName = new Name();
                searchName.firstName = firstName;
                searchName.lastName = lastName;
                
                PhonebookEntry result = phonebook.lookup(searchName);
                
                if (result != null) {
                    System.out.println(result.toString());
                } else {
                    System.out.println("-- Name not found");
                }
                System.out.println();

            } else if (input.equals("q")) {
                quit = true;
                System.out.println();
            }
        }
        scanner.close();
    }
}
