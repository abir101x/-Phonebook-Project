import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Phonebook {
    private PhonebookEntry[] entries;
    private int entryCount;
    public static final int DEFAULT_CAPACITY = 100;

    public Phonebook(String fileName) throws Exception {
        this.entries = new PhonebookEntry[DEFAULT_CAPACITY];
        this.entryCount = 0;
        
        File file = new File(fileName);
        Scanner infile = new Scanner(file);

        while (infile.hasNext() && this.entryCount < DEFAULT_CAPACITY) {
            this.entries[this.entryCount] = new PhonebookEntry();
            this.entries[this.entryCount].read(infile);
            this.entryCount++;
        }

        if (infile.hasNext()) {
            infile.close();
            throw new Exception("*** Exception *** Phonebook capacity exceeded - increase size of underlying array");
        }
        
        infile.close();
    }

    public int lookup(Name searchName) {
        for (int i = 0; i < this.entryCount; i++) {
            if (this.entries[i].name.equals(searchName)) {
                return i;
            }
        }
        return -1;
    }

    public int reverseLookup(PhoneNumber searchNumber) {
        for (int i = 0; i < this.entryCount; i++) {
            if (this.entries[i].phoneNumber.equals(searchNumber)) {
                return i;
            }
        }
        return -1;
    }

    public PhonebookEntry getEntry(int index) {
        if (index >= 0 && index < this.entryCount) {
            return this.entries[index];
        }
        return null;
    }
}
