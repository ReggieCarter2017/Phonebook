import java.lang.reflect.Field;

public class Contact  {
    protected String ID;
    protected String name;
    protected String adress;
    protected String phoneNumber;
    protected String email;

    public void setID(String ID)
    {
        this.ID = ID;
    }
    public String getID()
    {
        return ID;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setAdress(String adress)
    {
        this.adress = adress;
    }
    public String getAdress()
    {
        return adress;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }

    public <V extends String> Contact(V ID, V name, V adress, V phoneNumber, V email) {
        this.ID = ID;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public <V extends String> Contact()
    {
        this("0", "None", "None", "None", "None");
    }
}
