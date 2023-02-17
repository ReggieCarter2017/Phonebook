import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class Phonebook extends Contact implements Manager {
    List<Contact> contacts;

    public Phonebook()
    {
        contacts = new ArrayList<Contact>();
    }

    @Override
    public void addContact(Contact n) {
        if (!contacts.contains(n)) contacts.add(n);
    }

    @Override
    public void deleteContact(Contact n) {
        if (contacts.contains(n)) contacts.remove(n);
    }

    public void showInfo() {
        for (Contact s : contacts)
            System.out.printf("ID: %s\nName: %s\nAdress: %s\nPhone number: %s\nE-mail: %s\n\n", s.getID(), s.getName(), s.getAdress(), s.getPhoneNumber(), s.getEmail());
    }

    public Contact searchContact(String key) {

        for (Contact c : contacts) {
            if (c.getName().equals(key) || c.getAdress().equals(key) || c.getEmail().equals(key)
                    || c.getPhoneNumber().equals(key)) {
                return c;
            }
        }
        return null;
    }

    public void saveTheFile(String name, List<Contact> contacts)
    {
        File file = new File(name);
        FileWriter fw;
        {
            try {
                fw = new FileWriter(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        PrintWriter pw = new PrintWriter(fw);

        for (Contact c : contacts)
        {
            pw.printf("ID: %s\nName: %s\nAdress: %s\nPhone number: %s\nE-mail: %s\n\n", c.getID(),
                    c.getName(), c.getAdress(), c.getPhoneNumber(), c.getEmail());
            pw.println("23123");
        }
        pw.close();
    }
}
