package Aufgabe_Linkedlist;

import java.util.ArrayList;

public class AnimalList {
    AnimalListItem head; //speichert den Anfang der Liste

    //Methode: hängt ein Element (hier ein Animal) an die Liste an
    public void add(Animal v) {
        if (head == null) { //Liste ist leer
            head = new AnimalListItem(v); //v -> head
        } else {
            AnimalListItem item = head;
            while (item.next != null) {
                item = item.next;
            }
            item.next = new AnimalListItem(v);
            //if (head.next == null) { //2. Stelle ist leer
            // head.next = new AnimalListItem(v); //v hinzufügen
            //} else {
            //  head.next.next = new AnimalListItem(v);
        }
    }

    /*
    Methode: gibt die Elemente der Liste als String zurück. z. B : eine Liste enthält: "Katze", "Elefant", "Schlange"
             => gibt “Katze -> Elefant -> Schlange” zurück
     */

    public String toString(AnimalList aniList){
        AnimalListItem itemName = aniList.head;
        ArrayList<String> nameList = new ArrayList<String>();
        while(itemName != null){
            nameList.add(aniList.head.value.toString());
            head = head.next;
        }
        return "Die NameListe ist "+ nameList;

        /*
         AnimalListItem itemName = aniList.head;
        AnimalList nameList = new AnimalList;
        while(itemName != null){
            nameList.add(aniList.head.value.toString());
            head = head.next;
        }
         */



    }

}