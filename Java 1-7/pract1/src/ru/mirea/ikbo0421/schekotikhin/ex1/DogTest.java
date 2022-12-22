package ru.mirea.ikbo0421.schekotikhin.ex1;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Ryu", 3);
        Dog d2 = new Dog("Ken", 7);
        Dog d3 = new Dog("Pyosik");
        d3.setAge(1);
        System.out.println(d1);
        System.out.println(d1.intoHumanAge());
        System.out.println(d2.intoHumanAge());
        System.out.println(d3.intoHumanAge());

    }
}
