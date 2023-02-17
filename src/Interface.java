public class Interface {
    public void buttonClick()
    {
        Phonebook ph = new Phonebook();
        View vi = new View();
        boolean tr = true;

        while (tr) {
            System.out.println("1. Показать все контакты.\n2. Добавить контакт.\n3. Удалить контакт.\n4. Найти контакт.\n5. Сохранить в файл.\n6 Выход.\n");

            switch (vi.getString()) {
                case "1" -> ph.showInfo();
                case "2" -> {
                    System.out.println("Введите ID, имя, адрес, телефонный номер и e-mail контакта.");
                    Contact pc = new Contact(vi.getString(), vi.getString(), vi.getString(), vi.getString(), vi.getString());
                    ph.addContact(pc);
                }
                case "3" -> {
                    System.out.println("Введите ID контакта для его удаления: \n");
                    String temp = vi.getString();
                    for (Contact c : ph.contacts)
                    {
                        if (c.getID().equals(temp)) ph.deleteContact(c);
                    }
                }
                case "4" -> {
                    System.out.println("Поиск: \n");
                    vi.showOne(ph.searchContact(vi.getString()));
                }
                case "5" -> {
                    ph.saveTheFile(vi.getString(), ph.contacts);
                }
                case "6" -> tr = false;
            }
        }
    }
}
