import java.util.Scanner;
public class View {
    Scanner in = new Scanner(System.in);

    public String getValue()
    {
        return in.nextLine();
    }

    public String getString()
    {
        return in.nextLine();
    }

    public void showOne(Contact c) {
        System.out.printf("ID: %s\nName: %s\nAdress: %s\nPhone number: %s\nE-mail: %s\n\n", c.getID(),
                c.getName(), c.getAdress(), c.getPhoneNumber(), c.getEmail());
    }

}
