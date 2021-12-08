package Aufgabe_Linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Animal ani1 = new Animal("hund");
        Animal ani2 = new Animal("katze");
        Animal ani3 = new Animal("katze");
        Animal ani4 = new Animal("vogel");
        Animal ani5 = new Animal("frosch");

        AnimalList list1 = new AnimalList();
        AnimalListItem hund = new AnimalListItem(ani1);
        list1.head = hund.next;
        list1.add(ani1);
        list1.add(ani2);
        list1.add(ani3);
        list1.add(ani4);
        list1.add(ani5);
        list1.add(ani4);
        list1.add(ani3);

        list1.toString(list1);




    }


}
