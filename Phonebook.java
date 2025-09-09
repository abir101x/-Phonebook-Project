import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Phonebook {
    private Map<Name, PhonebookEntry> entries;

    public Phonebook(String fileName) throws Exception {
        this.entries = new HashMap<>();
        
        File file = new File(fileName);
        Scanner infile = new Scanner(file);

        while (infile.hasNext()) {
            PhonebookEntry newEntry = new PhonebookEntry();
            newEntry.read(infile);
            this.entries.put(newEntry.name, newEntry);
        }
        
        infile.close();
    }

    public PhonebookEntry lookup(Name searchName) {
        return this.entries.get(searchName);
    }
}
