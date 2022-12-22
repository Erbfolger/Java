package Exercise2;

public class Person {
    private String name, surname, patronymic;

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getFio(){
        StringBuilder sb = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
            sb.append(" ").append(name);
        if(patronymic != null && ! patronymic.equals(""))
            sb.append(" ").append(patronymic);
        return sb.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Щекотихин");
        Person p2 = new Person("Дмитрий", "Щекотихин", "");
        Person p3 = new Person("Дмитрий", "Щекотихин", "Вадимович");
        System.out.println(p1.getFio());
        System.out.println(p2.getFio());
        System.out.println(p3.getFio());
    }
}
